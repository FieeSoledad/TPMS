package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.Exam;
import com.huadi.project.tpms.dao.ExamDao;
import com.huadi.project.tpms.service.ExamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Exam)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 10:59:13
 */
@Service("examService")
@Transactional
public class ExamServiceImpl implements ExamService {
    @Resource
    private ExamDao examDao;

    /**
     * 通过ID查询单条数据
     *
     * @param examId 主键
     * @return 实例对象
     */
    @Override
    public Exam queryById(String examId) {
        return this.examDao.queryById(examId);
    }


    /**
     * 新增数据
     *
     * @param exam 实例对象
     * @return 实例对象
     */
    @Override
    public Exam insert(Exam exam) {
        this.examDao.insert(exam);
        return exam;
    }

    /**
     * 修改数据
     *
     * @param exam 实例对象
     * @return 实例对象
     */
    @Override
    public Exam update(Exam exam) {
        this.examDao.update(exam);
        return this.queryById(exam.getExamId());
    }
    //查询按钮的实现
    @Override
    public Exam queryExamByExamId(String examId) {

        return this.examDao.queryExamByExamId(examId);
    }
    @Override
    public List<Exam> queryExamByCourseId(String courseId) {

        return examDao.queryExamByCourseId(courseId);
    }
    @Override
    public List<Exam> queryExamByUserId(String userId) {

        return examDao.queryExamByUserId( userId);
    }
    @Override
    public List<Exam> queryExamByExamType(String examType) {

        return examDao.queryExamByExamType(examType);
    }
    @Override
    public List<Exam> queryExamByExamTime(String examTime) {

        return examDao.queryExamByExamTime(examTime);
    }
    @Override
    public List<Exam> queryExamByClassroomId(String classroomId) {

        return examDao.queryExamByClassroomId(classroomId);
    }

    /**
     * 通过主键删除数据
     *
     * @param examId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String examId) {
        return this.examDao.deleteById(examId) > 0;
    }

    //查询数据库中全部的内容
    @Override
    public List<Exam> examSelectAll(int pageStart, int pageEnd){
        return examDao.examSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<Exam> examSelectAllExa(){
        return examDao.examSelectAllExa();
    }

    //查询按钮的实现

}
