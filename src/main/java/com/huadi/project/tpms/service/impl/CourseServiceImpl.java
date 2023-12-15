package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.Course;
import com.huadi.project.tpms.dao.CourseDao;
import com.huadi.project.tpms.service.CourseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Course)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 11:07:54
 */
@Service("courseService")
@Transactional
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseDao courseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param courseId 主键
     * @return 实例对象
     */
    @Override
    public Course queryById(String courseId) {
        return this.courseDao.queryById(courseId);
    }


    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public Course insert(Course course) {
        this.courseDao.insert(course);
        return course;
    }

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public Course update(Course course) {
        this.courseDao.update(course);
        return this.queryById(course.getCourseId());
    }

    /**
     * 通过主键删除数据
     *
     * @param courseId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String courseId) {
        return this.courseDao.deleteById(courseId) > 0;
    }

    //查询全部的数据库中的内容
    @Override
    public List<Course> courseSelectAll(int pageStart, int pageEnd){
        return courseDao.courseSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<Course> courseSelectAllCou(){
        return courseDao.courseSelectAllCou();
    }
}
