package com.huadi.project.tpms.service.impl;

import com.huadi.project.tpms.entity.Student;
import com.huadi.project.tpms.dao.StudentDao;
import com.huadi.project.tpms.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 10:50:17
 */
@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param studentId 主键
     * @return 实例对象
     */
    @Override
    public Student queryStudentById(String studentId) {
        return this.studentDao.queryStudentById(studentId);
    }



    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        this.studentDao.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentDao.update(student);
        return this.queryStudentById(student.getStudentId());
    }

    /**
     * 通过主键删除数据
     *
     * @param studentId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String studentId) {
        return this.studentDao.deleteById(studentId) > 0;
    }

    @Override
    public List<Student> studentSelectAll(int pageStart, int pageEnd){
        return studentDao.studentSelectAll(pageStart,pageEnd);
    }

    @Override
    public List<Student> studentSelectAllStu(){
        return studentDao.studentSelectAllStu();
    }

    //查询按钮的实现
    @Override
    public List<Student> queryStudentByClassId(String classId) {

        return studentDao.queryStudentByClassId(classId);
    }

    @Override
    public Student queryStudentByStudentPhone(String studentPhone) {

        return this.studentDao.queryStudentByStudentPhone(studentPhone);
    }
    @Override
    public Student queryStudentByStudentName(String studentName) {

        return this.studentDao.queryStudentByStudentName(studentName);
    }
    @Override
    public List<Student> queryStudentByStudentGender(String studentGender) {

        return studentDao.queryStudentByStudentGender(studentGender);
    }
}
