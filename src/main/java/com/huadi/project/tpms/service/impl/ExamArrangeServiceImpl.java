package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.ExamArrange;
import com.huadi.project.tpms.dao.ExamArrangeDao;
import com.huadi.project.tpms.service.ExamArrangeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ExamArrange)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 10:55:51
 */
@Service("examArrangeService")
@Transactional
public class ExamArrangeServiceImpl implements ExamArrangeService {
    @Resource
    private ExamArrangeDao examArrangeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param examId 主键
     * @return 实例对象
     */
    @Override
    public ExamArrange queryById(String examId) {
        return this.examArrangeDao.queryById(examId);
    }

    /**
     * 新增数据
     *
     * @param examArrange 实例对象
     * @return 实例对象
     */
    @Override
    public ExamArrange insert(ExamArrange examArrange) {
        this.examArrangeDao.insert(examArrange);
        return examArrange;
    }

    /**
     * 修改数据
     *
     * @param examArrange 实例对象
     * @return 实例对象
     */
    @Override
    public ExamArrange update(ExamArrange examArrange) {
        this.examArrangeDao.update(examArrange);
        return this.queryById(examArrange.getExamId());
    }

    /**
     * 通过主键删除数据
     *
     * @param examId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String examId) {
        return this.examArrangeDao.deleteById(examId) > 0;
    }

    @Override
    public List<ExamArrange> examArrangeSelectAll(int pageStart, int pageEnd){
        return examArrangeDao.examArrangeSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<ExamArrange> examArrangeSelectAllExaA(){
        return examArrangeDao.examArrangeSelectAllExaA();
    }
    //查询按钮的实现
    @Override
    public List<ExamArrange> queryExamArrangeByExamId(String examId) {

        return examArrangeDao.queryExamArrangeByExamId(examId);
    }

    @Override
    public ExamArrange queryExamArrangeByStudentId(String studentId) {

        return this.examArrangeDao.queryExamArrangeByStudentId(studentId);
    }
}
