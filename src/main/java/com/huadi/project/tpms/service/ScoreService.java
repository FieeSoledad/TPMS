package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.Score;

import java.util.List;

/**
 * (Score)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 10:51:58
 */
public interface ScoreService {

    /**
     * 通过ID查询单条数据
     *
     * @param studentId 主键
     * @return 实例对象
     */
    Score queryById(String studentId);



    /**
     * 新增数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    Score insert(Score score);

    /**
     * 修改数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    Score update(Score score);

    /**
     * 通过主键删除数据
     *
     * @param studentId 主键
     * @return 是否成功
     */
    boolean deleteById(String studentId);
    List<Score> scoreSelectAll(int pageStart, int pageEnd);

    List<Score> scoreSelectAllSco();
    //查询按钮的实现
    List<Score> queryScoreByStudentId(String studentId);
    List<Score> queryScoreByCourseId(String courseId);
    List<Score> queryScoreByScoreId(Integer score);


}
