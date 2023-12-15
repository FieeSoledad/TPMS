package com.huadi.project.tpms.dao;

import com.huadi.project.tpms.entity.CourseArrange;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (CourseArrange)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-25 11:40:06
 */
public interface CourseArrangeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param courseId 主键
     * @return 实例对象
     */
    CourseArrange queryById(String courseId);
    //查询按钮的实现
    CourseArrange queryCourseArrangeByCourseId(String courseId);
    List<CourseArrange> queryCourseArrangeByClassroomId(String classroomId);
    List<CourseArrange> queryCourseArrangeByCourseArrangeTime(String courseArrangeTime);
    List<CourseArrange> queryCourseArrangeByCourseArrangePweek(String courseArrangePweek);


    /**
     * 统计总行数
     *
     * @param courseArrange 查询条件
     * @return 总行数
     */
    long count(CourseArrange courseArrange);

    /**
     * 新增数据
     *
     * @param courseArrange 实例对象
     * @return 影响行数
     */
    int insert(CourseArrange courseArrange);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CourseArrange> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CourseArrange> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CourseArrange> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CourseArrange> entities);

    /**
     * 修改数据
     *
     * @param courseArrange 实例对象
     * @return 影响行数
     */
    int update(CourseArrange courseArrange);

    /**
     * 通过主键删除数据
     *
     * @param courseId 主键
     * @return 影响行数
     */
    int deleteById(String courseId);
    //查询全部的数据
    List<CourseArrange> courseArrangeSelectAll(@Param("pageStart") int pageStart,@Param("pageEnd") int pageEnd);
    List<CourseArrange> courseArrangeSelectAllCouA();

}

