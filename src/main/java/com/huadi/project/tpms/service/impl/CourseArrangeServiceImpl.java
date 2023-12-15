package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.CourseArrange;
import com.huadi.project.tpms.dao.CourseArrangeDao;
import com.huadi.project.tpms.service.CourseArrangeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CourseArrange)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 11:40:08
 */
@Service("courseArrangeService")
@Transactional
public class CourseArrangeServiceImpl implements CourseArrangeService {
    @Resource
    private CourseArrangeDao courseArrangeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param courseId 主键
     * @return 实例对象
     */
    @Override
    public CourseArrange queryById(String courseId) {
        return this.courseArrangeDao.queryById(courseId);
    }
    //查询按钮的实现
    @Override
    public CourseArrange queryCourseArrangeByCourseId(String courseId) {

        return this.courseArrangeDao.queryCourseArrangeByCourseId(courseId);
    }

    @Override
    public List<CourseArrange> queryCourseArrangeByClassroomId(String classroomId) {

        return courseArrangeDao.queryCourseArrangeByClassroomId(classroomId);
    }

    @Override
    public List<CourseArrange> queryCourseArrangeByCourseArrangeTime(String courseArrangeTime) {

        return courseArrangeDao.queryCourseArrangeByCourseArrangeTime(courseArrangeTime);
    }

    @Override
    public List<CourseArrange> queryCourseArrangeByCourseArrangePweek(String courseArrangePweek) {

        return courseArrangeDao.queryCourseArrangeByCourseArrangePweek(courseArrangePweek);
    }


    /**
     * 新增数据
     *
     * @param courseArrange 实例对象
     * @return 实例对象
     */
    @Override
    public CourseArrange insert(CourseArrange courseArrange) {
        this.courseArrangeDao.insert(courseArrange);
        return courseArrange;
    }

    /**
     * 修改数据
     *
     * @param courseArrange 实例对象
     * @return 实例对象
     */
    @Override
    public CourseArrange update(CourseArrange courseArrange) {
        this.courseArrangeDao.update(courseArrange);
        return this.queryById(courseArrange.getCourseId());
    }

    /**
     * 通过主键删除数据
     *
     * @param courseId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String courseId) {
        return this.courseArrangeDao.deleteById(courseId) > 0;
    }

    @Override
    public List<CourseArrange> courseArrangeSelectAll(int pageStart, int pageEnd){
        return courseArrangeDao.courseArrangeSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<CourseArrange> courseArrangeSelectAllCouA(){
        return courseArrangeDao.courseArrangeSelectAllCouA();
    }
    //查询按钮的实现

}
