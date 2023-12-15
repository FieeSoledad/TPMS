package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.ExamArrange;

import java.util.List;


/**
 * (ExamArrange)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 10:55:51
 */
public interface ExamArrangeService {

    /**
     * 通过ID查询单条数据
     *
     * @param examId 主键
     * @return 实例对象
     */
    ExamArrange queryById(String examId);



    /**
     * 新增数据
     *
     * @param examArrange 实例对象
     * @return 实例对象
     */
    ExamArrange insert(ExamArrange examArrange);

    /**
     * 修改数据
     *
     * @param examArrange 实例对象
     * @return 实例对象
     */
    ExamArrange update(ExamArrange examArrange);

    /**
     * 通过主键删除数据
     *
     * @param examId 主键
     * @return 是否成功
     */
    boolean deleteById(String examId);

    //查询全部的数据库对象的方法
    List<ExamArrange> examArrangeSelectAll(int pageStart, int pageEnd);

    List<ExamArrange> examArrangeSelectAllExaA();
    List<ExamArrange> queryExamArrangeByExamId(String examId);
    ExamArrange queryExamArrangeByStudentId(String studentId);

}
