package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.ExamArrange;
import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.service.ExamArrangeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ExamArrange)表控制层
 *
 * @author makejava
 * @since 2023-07-25 10:55:51
 */
@Controller
@RequestMapping("examArrange")
public class ExamArrangeController {
    /**
     * 服务对象
     */
    @Resource
    private ExamArrangeService examArrangeService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ExamArrange> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.examArrangeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param examArrange 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ExamArrange> add(ExamArrange examArrange) {
        return ResponseEntity.ok(this.examArrangeService.insert(examArrange));
    }

    /**
     * 编辑数据
     *
     * @param examArrange 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ExamArrange> edit(@RequestBody ExamArrange examArrange) {
        return ResponseEntity.ok(this.examArrangeService.update(examArrange));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.examArrangeService.deleteById(id));
    }
    //查询全部的数据库信息的方法
    @RequestMapping(value="examArrangeSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String examArrangeSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<ExamArrange> classes=examArrangeService.examArrangeSelectAll(pageStart,pageEnd);
        List<ExamArrange> classes1=examArrangeService.examArrangeSelectAllExaA();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",classes);
        jsonObject.put("count",classes1.size());
        return JSONObject.toJSONString(jsonObject);
    }
    //查询按钮的实现
    @RequestMapping(value = "/queryExamArrangeByExamId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryExamArrangeByExamId(@RequestParam String examId) {
        List<ExamArrange> examArranges = examArrangeService.queryExamArrangeByExamId(examId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",examArranges);
        jsonObject.put("count",examArranges.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryExamArrangeByStudentId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<ExamArrange> queryExamArrangeByStudentId(@RequestParam String studentId) {
        return ResponseEntity.ok(this.examArrangeService.queryExamArrangeByStudentId(studentId));
    }
    @RequestMapping("/save")
    @ResponseBody
    public DataResult<String> addExamArrange(@RequestBody ExamArrange examArrange){
        examArrangeService.insert(examArrange);
        return DataResult.succ();
    }



}

