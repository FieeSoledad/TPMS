package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.Course;

import java.util.List;

/**
 * (Course)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 11:07:54
 */
public interface CourseService {

    /**
     * 通过ID查询单条数据
     *
     * @param courseId 主键
     * @return 实例对象
     */
    Course queryById(String courseId);


    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    Course insert(Course course);

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    Course update(Course course);

    /**
     * 通过主键删除数据
     *
     * @param courseId 主键
     * @return 是否成功
     */
    boolean deleteById(String courseId);

    //查询全部的数据库内容
    List<Course> courseSelectAll(int pageStart, int pageEnd);

    List<Course> courseSelectAllCou();

}
