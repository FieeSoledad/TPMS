package com.huadi.project.tpms.dao;

import com.huadi.project.tpms.entity.Classes;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Classes)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-25 11:03:28
 */
public interface ClassesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param classId 主键
     * @return 实例对象
     */
    Classes queryById(String classId);
    List<Classes> queryClassByClassId(String classId);
    List<Classes> queryClassByMajorId(String majorId);

    /**
     * 统计总行数
     *
     * @param classes 查询条件
     * @return 总行数
     */
    long count(Classes classes);

    /**
     * 新增数据
     *
     * @param classes 实例对象
     * @return 影响行数
     */
    int insert(Classes classes);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Classes> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Classes> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Classes> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Classes> entities);

    /**
     * 修改数据
     *
     * @param classes 实例对象
     * @return 影响行数
     */
    int update(Classes classes);

    /**
     * 通过主键删除数据
     *
     * @param classId 主键
     * @return 影响行数
     */
    int deleteById(String classId);


    //查询全部数据的方法

    List<Classes> classesSelectAll(@Param("pageStart") int pageStart,@Param("pageEnd") int pageEnd);
    List<Classes> classesSelectAllCla();



}

