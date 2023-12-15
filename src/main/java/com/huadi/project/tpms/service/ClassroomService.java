package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.Classroom;

import java.util.List;

/**
 * (Classroom)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 11:04:58
 */
public interface ClassroomService {

    /**
     * 通过ID查询单条数据
     *
     * @param classroomId 主键
     * @return 实例对象
     */
    Classroom queryById(String classroomId);


    /**
     * 新增数据
     *
     * @param classroom 实例对象
     * @return 实例对象
     */
    Classroom insert(Classroom classroom);

    /**
     * 修改数据
     *
     * @param classroom 实例对象
     * @return 实例对象
     */
    Classroom update(Classroom classroom);

    /**
     * 通过主键删除数据
     *
     * @param classroomId 主键
     * @return 是否成功
     */
    boolean deleteById(String classroomId);
    //查询全部的数据
    List<Classroom> classroomSelectAll(int pageStart, int pageEnd);

    List<Classroom> classroomSelectAllClaR();
    //查询按钮的实现
    Classroom queryClassroomByClassroomId(String classroomId);
    List<Classroom> queryClassroomByClassroomSize(String classroomSize);
    List<Classroom> queryClassroomByClassroomPlace(String classroomPlace);
    List<Classroom> queryClassroomByClassroomType(String classroomType);

}
