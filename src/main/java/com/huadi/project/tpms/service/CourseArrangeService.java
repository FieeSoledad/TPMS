package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.CourseArrange;

import java.util.List;

/**
 * (CourseArrange)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 11:40:07
 */
public interface CourseArrangeService {

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
     * 新增数据
     *
     * @param courseArrange 实例对象
     * @return 实例对象
     */
    CourseArrange insert(CourseArrange courseArrange);

    /**
     * 修改数据
     *
     * @param courseArrange 实例对象
     * @return 实例对象
     */
    CourseArrange update(CourseArrange courseArrange);

    /**
     * 通过主键删除数据
     *
     * @param courseId 主键
     * @return 是否成功
     */
    boolean deleteById(String courseId);
    List<CourseArrange> courseArrangeSelectAll(int pageStart, int pageEnd);

    List<CourseArrange> courseArrangeSelectAllCouA();

}
