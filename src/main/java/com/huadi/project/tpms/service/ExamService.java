package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.Exam;

import java.util.List;

/**
 * (Exam)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 10:59:13
 */
public interface ExamService {

    /**
     * 通过ID查询单条数据
     *
     * @param examId 主键
     * @return 实例对象
     */
    Exam queryById(String examId);
    //查询按钮的实现
    Exam queryExamByExamId(String examId);
    List<Exam> queryExamByCourseId(String courseId);
    List<Exam> queryExamByUserId(String userId);
    List<Exam> queryExamByExamType(String examType);
    List<Exam> queryExamByExamTime(String examTime);
    List<Exam> queryExamByClassroomId(String classroomId);


    /**
     * 新增数据
     *
     * @param exam 实例对象
     * @return 实例对象
     */
    Exam insert(Exam exam);

    /**
     * 修改数据
     *
     * @param exam 实例对象
     * @return 实例对象
     */
    Exam update(Exam exam);

    /**
     * 通过主键删除数据
     *
     * @param examId 主键
     * @return 是否成功
     */
    boolean deleteById(String examId);
    //查询数据库的全部内容
    List<Exam> examSelectAll(int pageStart, int pageEnd);

    List<Exam> examSelectAllExa();

}
