package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.Course;
import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Course)表控制层
 *
 * @author makejava
 * @since 2023-07-25 11:07:53
 */
@Controller
@RequestMapping("course")
public class CourseController {
    /**
     * 服务对象
     */
    @Resource
    private CourseService courseService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Course> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.courseService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param course 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Course> add(Course course) {
        return ResponseEntity.ok(this.courseService.insert(course));
    }

    /**
     * 编辑数据
     *
     * @param course 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Course> edit(@RequestBody Course course) {
        return ResponseEntity.ok(this.courseService.update(course));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.courseService.deleteById(id));
    }
    //查询全部的数据库中的内容
    @RequestMapping(value="courseSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String courseSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<Course> classes=courseService.courseSelectAll(pageStart,pageEnd);
        List<Course> classes1=courseService.courseSelectAllCou();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",classes);
        jsonObject.put("count",classes1.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping("/save")
    @ResponseBody
    public DataResult<String> addCourse(@RequestBody Course course){
        System.out.println("=============================");
        courseService.insert(course);
        return DataResult.succ();
    }

}

