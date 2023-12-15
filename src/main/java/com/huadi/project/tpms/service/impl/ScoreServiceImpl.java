package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.Score;
import com.huadi.project.tpms.dao.ScoreDao;
import com.huadi.project.tpms.service.ScoreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Score)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 10:51:58
 */
@Service("scoreService")
@Transactional
public class ScoreServiceImpl implements ScoreService {
    @Resource
    private ScoreDao scoreDao;

    /**
     * 通过ID查询单条数据
     *
     * @param studentId 主键
     * @return 实例对象
     */
    @Override
    public Score queryById(String studentId) {
        return this.scoreDao.queryById(studentId);
    }



    /**
     * 新增数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    @Override
    public Score insert(Score score) {
        this.scoreDao.insert(score);
        return score;
    }

    /**
     * 修改数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    @Override
    public Score update(Score score) {
        this.scoreDao.update(score);
        return this.queryById(score.getStudentId());
    }

    /**
     * 通过主键删除数据
     *
     * @param studentId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String studentId) {
        return this.scoreDao.deleteById(studentId) > 0;
    }

    @Override
    public List<Score> scoreSelectAll(int pageStart, int pageEnd){
        return scoreDao.scoreSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<Score> scoreSelectAllSco(){
        return scoreDao.scoreSelectAllSco();
    }

    //查询按钮的实现
    @Override
    public List<Score> queryScoreByStudentId(String studentId) {

        return scoreDao.queryScoreByStudentId(studentId);
    }
    @Override
    public List<Score> queryScoreByCourseId(String courseId) {

        return scoreDao.queryScoreByCourseId(courseId);
    }
    @Override
    public List<Score> queryScoreByScoreId(Integer score) {

        return scoreDao.queryScoreByScoreId(score);
    }

}
