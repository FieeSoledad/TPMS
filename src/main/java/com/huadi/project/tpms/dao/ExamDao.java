package com.huadi.project.tpms.dao;

import com.huadi.project.tpms.entity.Exam;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Exam)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-25 10:59:12
 */
public interface ExamDao {

    /**
     * 通过ID查询单条数据
     *
     * @param examId 主键
     * @return 实例对象
     */
    Exam queryById(String examId);



    /**
     * 统计总行数
     *
     * @param exam 查询条件
     * @return 总行数
     */
    long count(Exam exam);

    /**
     * 新增数据
     *
     * @param exam 实例对象
     * @return 影响行数
     */
    int insert(Exam exam);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Exam> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Exam> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Exam> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Exam> entities);

    /**
     * 修改数据
     *
     * @param exam 实例对象
     * @return 影响行数
     */
    int update(Exam exam);

    /**
     * 通过主键删除数据
     *
     * @param examId 主键
     * @return 影响行数
     */
    int deleteById(String examId);

    //查询数据库全部的内容
    List<Exam> examSelectAll(@Param("pageStart") int pageStart,@Param("pageEnd") int pageEnd);
    List<Exam> examSelectAllExa();
    //查询按钮的实现
    Exam queryExamByExamId(String examId);
    List<Exam> queryExamByCourseId(String courseId);
    List<Exam> queryExamByUserId(String userId);
    List<Exam> queryExamByExamType(String examType);
    List<Exam> queryExamByExamTime(String examTime);
    List<Exam> queryExamByClassroomId(String classroomId);



}

