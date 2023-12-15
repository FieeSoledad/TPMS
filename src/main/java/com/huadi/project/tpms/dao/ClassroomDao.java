package com.huadi.project.tpms.dao;

import com.huadi.project.tpms.entity.Classroom;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Classroom)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-25 11:04:58
 */
public interface ClassroomDao {

    /**
     * 通过ID查询单条数据
     *
     * @param classroomId 主键
     * @return 实例对象
     */
    Classroom queryById(String classroomId);


    /**
     * 统计总行数
     *
     * @param classroom 查询条件
     * @return 总行数
     */
    long count(Classroom classroom);

    /**
     * 新增数据
     *
     * @param classroom 实例对象
     * @return 影响行数
     */
    int insert(Classroom classroom);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Classroom> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Classroom> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Classroom> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Classroom> entities);

    /**
     * 修改数据
     *
     * @param classroom 实例对象
     * @return 影响行数
     */
    int update(Classroom classroom);

    /**
     * 通过主键删除数据
     *
     * @param classroomId 主键
     * @return 影响行数
     */
    int deleteById(String classroomId);
    //查询所有的数据库表的内容
    List<Classroom> classroomSelectAll(@Param("pageStart") int pageStart,@Param("pageEnd") int pageEnd);
    List<Classroom> classroomSelectAllClaR();
    //查询按钮的实现
    Classroom queryClassroomByClassroomId(String classroomId);
    List<Classroom> queryClassroomByClassroomSize(String classroomSize);
    List<Classroom> queryClassroomByClassroomPlace(String classroomPlace);
    List<Classroom> queryClassroomByClassroomType(String classroomType);

}

