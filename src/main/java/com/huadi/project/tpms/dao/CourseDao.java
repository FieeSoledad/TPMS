package com.huadi.project.tpms.dao;

import com.huadi.project.tpms.entity.Course;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Course)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-25 11:07:53
 */
public interface CourseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param courseId 主键
     * @return 实例对象
     */
    Course queryById(String courseId);


    /**
     * 统计总行数
     *
     * @param course 查询条件
     * @return 总行数
     */
    long count(Course course);

    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 影响行数
     */
    int insert(Course course);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Course> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Course> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Course> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Course> entities);

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 影响行数
     */
    int update(Course course);

    /**
     * 通过主键删除数据
     *
     * @param courseId 主键
     * @return 影响行数
     */
    int deleteById(String courseId);

    List<Course> courseSelectAll(@Param("pageStart") int pageStart,@Param("pageEnd") int pageEnd);
    List<Course> courseSelectAllCou();

}

