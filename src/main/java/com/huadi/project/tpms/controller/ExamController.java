package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.Exam;
import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.service.ExamService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Exam)表控制层
 *
 * @author makejava
 * @since 2023-07-25 10:59:12
 */
@Controller
@RequestMapping("exam")
public class ExamController {
    /**
     * 服务对象
     */
    @Resource
    private ExamService examService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Exam> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.examService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param exam 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Exam> add(Exam exam) {
        return ResponseEntity.ok(this.examService.insert(exam));
    }

    /**
     * 编辑数据
     *
     * @param exam 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Exam> edit(@RequestBody Exam exam) {
        return ResponseEntity.ok(this.examService.update(exam));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.examService.deleteById(id));
    }

    @RequestMapping(value="examSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String examSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<Exam> classes=examService.examSelectAll(pageStart,pageEnd);
        List<Exam> classes1=examService.examSelectAllExa();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",classes);
        jsonObject.put("count",classes1.size());
        return JSONObject.toJSONString(jsonObject);
    }

    //查询按钮的实现
    @RequestMapping(value = "/queryExamByExamId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<Exam> queryExamByExamId(@RequestParam String examId) {
        return ResponseEntity.ok(this.examService.queryExamByExamId(examId));
    }
    @RequestMapping(value = "/queryExamByCourseId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryExamByCourseId(@RequestParam String courseId) {
        List<Exam> exams = examService.queryExamByCourseId(courseId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",exams);
        jsonObject.put("count",exams.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryExamByUserId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryExamByUserId(@RequestParam String userId) {
        List<Exam> exams = examService.queryExamByUserId(userId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",exams);
        jsonObject.put("count",exams.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryExamByExamType", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryExamByExamType(@RequestParam String examType) {
        List<Exam> exams = examService.queryExamByExamType(examType);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",exams);
        jsonObject.put("count",exams.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryExamByExamTime", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryExamByExamTime(@RequestParam String examTime) {
        List<Exam> exams = examService.queryExamByExamTime(examTime);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",exams);
        jsonObject.put("count",exams.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryExamByClassroomId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryExamByClassroomId(@RequestParam String classroomId) {
        List<Exam> exams = examService.queryExamByClassroomId(classroomId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",exams);
        jsonObject.put("count",exams.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping("/save")
    @ResponseBody
    public DataResult<String> addExam(@RequestBody Exam exam){
        examService.insert(exam);
        return DataResult.succ();
    }
}

