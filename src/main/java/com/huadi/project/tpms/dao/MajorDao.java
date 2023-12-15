package com.huadi.project.tpms.dao;

import com.huadi.project.tpms.entity.Major;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Major)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-25 10:54:17
 */
public interface MajorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param majorId 主键
     * @return 实例对象
     */
    Major queryById(String majorId);


    /**
     * 统计总行数
     *
     * @param major 查询条件
     * @return 总行数
     */
    long count(Major major);

    /**
     * 新增数据
     *
     * @param major 实例对象
     * @return 影响行数
     */
    int insert(Major major);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Major> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Major> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Major> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Major> entities);

    /**
     * 修改数据
     *
     * @param major 实例对象
     * @return 影响行数
     */
    int update(Major major);

    /**
     * 通过主键删除数据
     *
     * @param majorId 主键
     * @return 影响行数
     */
    int deleteById(String majorId);
    //查询数据库全部的内容
    List<Major> majorSelectAll(@Param("pageStart") int pageStart,@Param("pageEnd") int pageEnd);
    List<Major> majorSelectAllMaj();

    //查询按钮的实现
    List<Major> queryMajorByMajorId(String majorId);
    List<Major> queryMajorByCollegeId(String collegeId);
    List<Major> queryMajorByMajorName(String majorName);


}

