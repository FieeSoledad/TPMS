package com.huadi.project.tpms.dao;

import com.huadi.project.tpms.entity.College;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (College)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-25 11:06:19
 */
public interface CollegeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param collegeId 主键
     * @return 实例对象
     */
    College queryById(String collegeId);

    /**
     * 统计总行数
     *
     * @param college 查询条件
     * @return 总行数
     */
    long count(College college);

    /**
     * 新增数据
     *
     * @param college 实例对象
     * @return 影响行数
     */
    int insert(College college);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<College> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<College> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<College> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<College> entities);

    /**
     * 修改数据
     *
     * @param college 实例对象
     * @return 影响行数
     */
    int update(College college);

    /**
     * 通过主键删除数据
     *
     * @param collegeId 主键
     * @return 影响行数
     */
    int deleteById(String collegeId);
    List<College> collegeSelectAll(@Param("pageStart") int pageStart,@Param("pageEnd") int pageEnd);
    List<College> collegeSelectAllCol();

    //查询按钮的实现
    College queryCollegeByCollegeId(String collegeId);
    List<College> queryCollegeByCollegePlace(String collegePlace);
    College queryCollegeByCollegeName(String collegeId);

}

