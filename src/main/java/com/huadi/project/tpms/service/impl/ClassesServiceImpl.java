package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.Classes;
import com.huadi.project.tpms.dao.ClassesDao;
import com.huadi.project.tpms.service.ClassesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Classes)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 11:03:28
 */
@Service("classesService")
@Transactional
public class ClassesServiceImpl implements ClassesService {
    @Resource  //之所以能装配是因为交给Spring容器进行管理了吗？
    private ClassesDao classesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param classId 主键
     * @return 实例对象
     */
    @Override
    public Classes queryById(String classId) {
        return this.classesDao.queryById(classId);
    }

    @Override
    public List<Classes> queryClassByClassId(String classId) {

        return classesDao.queryClassByClassId(classId);
    }
    @Override
    public List<Classes> queryClassByMajorId(String majorId) {

        return classesDao.queryClassByMajorId(majorId);
    }


    /**
     * 新增数据
     *
     * @param classes 实例对象
     * @return 实例对象
     */
    @Override
    public Classes insert(Classes classes) {
        this.classesDao.insert(classes);
        return classes;
    }

    /**
     * 修改数据
     *
     * @param classes 实例对象
     * @return 实例对象
     */
    @Override
    public Classes update(Classes classes) {
        this.classesDao.update(classes);
        return this.queryById(classes.getClassId());
    }

    /**
     * 通过主键删除数据
     *
     * @param classId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String classId) {
        return this.classesDao.deleteById(classId) > 0;
    }


    //查询全部的数据的方法实现
    @Override
    public List<Classes> classesSelectAll(int pageStart, int pageEnd){
        return classesDao.classesSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<Classes> classesSelectAllCla(){
        return classesDao.classesSelectAllCla();
    }
}
