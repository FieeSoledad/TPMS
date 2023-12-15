package com.huadi.project.tpms.service;

import com.huadi.project.tpms.entity.Student;

import java.util.List;

/**
 * (Student)表服务接口
 *
 * @author makejava
 * @since 2023-07-25 10:50:17
 */
public interface StudentService {

    /**
     * 通过ID查询单条数据
     *
     * @param studentId 主键
     * @return 实例对象
     */
    Student queryStudentById(String studentId);



    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param studentId 主键
     * @return 是否成功
     */
    boolean deleteById(String studentId);
//  这个是展示全部数据库的内容
    List<Student> studentSelectAll(int pageStart, int pageEnd);

    List<Student> studentSelectAllStu();
    //查询按钮的实现
    List<Student> queryStudentByClassId(String classId);
    Student queryStudentByStudentPhone(String studentPhone);
    Student queryStudentByStudentName(String studentName);
    List<Student> queryStudentByStudentGender(String studentGender);


}
