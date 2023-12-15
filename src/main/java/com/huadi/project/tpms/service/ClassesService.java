package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.Classes;

import java.util.List;

/**
 * (Classes)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 11:03:28
 */
public interface ClassesService {

    /**
     * 通过ID查询单条数据
     *
     * @param classId 主键
     * @return 实例对象
     */
    Classes queryById(String classId);
    //查询按钮的实现
    List<Classes> queryClassByClassId(String classId);
    List<Classes> queryClassByMajorId(String majorId);



    /**
     * 新增数据
     *
     * @param classes 实例对象
     * @return 实例对象
     */
    Classes insert(Classes classes);

    /**
     * 修改数据
     *
     * @param classes 实例对象
     * @return 实例对象
     */
    Classes update(Classes classes);

    /**
     * 通过主键删除数据
     *
     * @param classId 主键
     * @return 是否成功
     */
    boolean deleteById(String classId);

    //查询全部数据的方法
    List<Classes> classesSelectAll(int pageStart, int pageEnd);

    List<Classes> classesSelectAllCla();

    //增加数据的方法




}
