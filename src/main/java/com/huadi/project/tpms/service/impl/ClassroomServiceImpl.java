package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.Classroom;
import com.huadi.project.tpms.dao.ClassroomDao;
import com.huadi.project.tpms.service.ClassroomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Classroom)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 11:04:58
 */
@Service("classroomService")
@Transactional

public class ClassroomServiceImpl implements ClassroomService {
    @Resource
    private ClassroomDao classroomDao;

    /**
     * 通过ID查询单条数据
     *
     * @param classroomId 主键
     * @return 实例对象
     */
    @Override
    public Classroom queryById(String classroomId) {
        return this.classroomDao.queryById(classroomId);
    }



    @Override
    public List<Classroom> classroomSelectAll(int pageStart, int pageEnd){
        return classroomDao.classroomSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<Classroom> classroomSelectAllClaR(){
        return classroomDao.classroomSelectAllClaR();
    }
    /**
     * 新增数据
     *
     * @param classroom 实例对象
     * @return 实例对象
     */
    @Override
    public Classroom insert(Classroom classroom) {
        this.classroomDao.insert(classroom);
        return classroom;
    }

    /**
     * 修改数据
     *
     * @param classroom 实例对象
     * @return 实例对象
     */
    @Override
    public Classroom update(Classroom classroom) {
        this.classroomDao.update(classroom);
        return this.queryById(classroom.getClassroomId());
    }

    /**
     * 通过主键删除数据
     *
     * @param classroomId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String classroomId) {
        return this.classroomDao.deleteById(classroomId) > 0;
    }

    //查询按钮的实现
    @Override
    public Classroom queryClassroomByClassroomId(String classroomId) {

        return this.classroomDao.queryClassroomByClassroomId(classroomId);
    }
    @Override
    public List<Classroom> queryClassroomByClassroomSize(String classroomSize) {

        return classroomDao.queryClassroomByClassroomSize(classroomSize);
    }
    @Override
    public List<Classroom> queryClassroomByClassroomPlace(String classroomPlace) {

        return classroomDao.queryClassroomByClassroomPlace(classroomPlace);
    }
    @Override
    public List<Classroom> queryClassroomByClassroomType(String classroomType) {

        return classroomDao.queryClassroomByClassroomType(classroomType);
    }

}
