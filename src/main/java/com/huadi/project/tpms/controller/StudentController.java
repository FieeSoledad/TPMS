package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.Student;
import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2023-07-25 10:50:17
 */
@Controller
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;


    /**
     * 通过主键查询单条数据
     *
     * @param studentId 主键
     * @return 单条数据
     */
    @RequestMapping(value = "/queryStudentById", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<Student> queryStudentById(@RequestParam String studentId) {
        return ResponseEntity.ok(this.studentService.queryStudentById(studentId));
    }

    /**
     * 新增数据
     *
     * @param student 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Student> add(Student student) {
        return ResponseEntity.ok(this.studentService.insert(student));
    }

    /**
     * 编辑数据
     *
     * @param student 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Student> edit(@RequestBody Student student) {
        return ResponseEntity.ok(this.studentService.update(student));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.studentService.deleteById(id));
    }


    /* 展示  */
    @RequestMapping(value="studentSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String studentSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<Student> student=studentService.studentSelectAll(pageStart,pageEnd);
        List<Student> student1=studentService.studentSelectAllStu();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",student);
        jsonObject.put("count",student1.size());

        return JSONObject.toJSONString(jsonObject);
    }
    //查询按钮的实现
    @RequestMapping(value = "/queryStudentByClassId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryStudentByClassId(@RequestParam String classId) {
        List<Student> students = studentService.queryStudentByClassId(classId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",students);
        jsonObject.put("count",students.size());
        return JSONObject.toJSONString(jsonObject);
    }

    @RequestMapping(value = "/queryStudentByStudentPhone", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<Student> queryStudentByStudentPhone(@RequestParam String studentPhone) {
        return ResponseEntity.ok(this.studentService.queryStudentByStudentPhone(studentPhone));
    }

    @RequestMapping(value = "/queryStudentByStudentName", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<Student> queryStudentByStudentName(@RequestParam String studentName) {
        return ResponseEntity.ok(this.studentService.queryStudentByStudentName(studentName));
    }

    @RequestMapping(value = "/queryStudentByStudentGender", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryStudentByStudentGender(@RequestParam String studentGender) {
        List<Student> students = studentService.queryStudentByStudentGender(studentGender);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",students);
        jsonObject.put("count",students.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @Resource
    private StudentService addstudentService;

    @RequestMapping("/save")
    @ResponseBody
    public DataResult<String> addStudent(@RequestBody Student student){
        addstudentService.insert(student);
        return DataResult.succ();
    }


}

