package com.huadi.project.tpms.dao;

import com.huadi.project.tpms.entity.Score;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Score)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-25 10:51:58
 */
public interface ScoreDao {

    /**
     * 通过ID查询单条数据
     *
     * @param studentId 主键
     * @return 实例对象
     */
    Score queryById(String studentId);


    /**
     * 统计总行数
     *
     * @param score 查询条件
     * @return 总行数
     */
    long count(Score score);

    /**
     * 新增数据
     *
     * @param score 实例对象
     * @return 影响行数
     */
    int insert(Score score);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Score> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Score> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Score> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Score> entities);

    /**
     * 修改数据
     *
     * @param score 实例对象
     * @return 影响行数
     */
    int update(Score score);

    /**
     * 通过主键删除数据
     *
     * @param studentId 主键
     * @return 影响行数
     */
    int deleteById(String studentId);
    //查询数据库中的全部内容
    List<Score> scoreSelectAll(@Param("pageStart") int pageStart,@Param("pageEnd") int pageEnd);
    List<Score> scoreSelectAllSco();

    //查询按钮的是实现
    List<Score> queryScoreByStudentId(String studentId);
    List<Score> queryScoreByCourseId(String courseId);
    List<Score> queryScoreByScoreId(Integer score);

}

