package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.CourseArrange;
import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.service.CourseArrangeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CourseArrange)表控制层
 *
 * @author makejava
 * @since 2023-07-25 11:40:05
 */
@Controller
@RequestMapping("courseArrange")
public class CourseArrangeController {
    /**
     * 服务对象
     */
    @Resource
    private CourseArrangeService courseArrangeService;



    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<CourseArrange> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.courseArrangeService.queryById(id));
    }
    //查询按钮的实现
    @RequestMapping(value = "/queryCourseArrangeByCourseId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<CourseArrange> queryCourseArrangeByCourseId(@RequestParam String courseId) {
        return ResponseEntity.ok(this.courseArrangeService.queryCourseArrangeByCourseId(courseId));
    }
    @RequestMapping(value = "/queryCourseArrangeByClassroomId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryCourseArrangeByClassroomId(@RequestParam String classroomId) {
        List<CourseArrange> courseArranges = courseArrangeService.queryCourseArrangeByClassroomId(classroomId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",courseArranges);
        jsonObject.put("count",courseArranges.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryCourseArrangeByCourseArrangeTime", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryCourseArrangeByCourseArrangeTime(@RequestParam String courseArrangeTime) {
        List<CourseArrange> courseArranges = courseArrangeService.queryCourseArrangeByCourseArrangeTime(courseArrangeTime);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",courseArranges);
        jsonObject.put("count",courseArranges.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryCourseArrangeByCourseArrangePweek", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryCourseArrangeByCourseArrangePweek(@RequestParam String courseArrangePweek) {
        List<CourseArrange> courseArranges = courseArrangeService.queryCourseArrangeByCourseArrangePweek(courseArrangePweek);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",courseArranges);
        jsonObject.put("count",courseArranges.size());
        return JSONObject.toJSONString(jsonObject);
    }

    /**
     * 新增数据
     *
     * @param courseArrange 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<CourseArrange> add(CourseArrange courseArrange) {
        return ResponseEntity.ok(this.courseArrangeService.insert(courseArrange));
    }

    /**
     * 编辑数据
     *
     * @param courseArrange 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<CourseArrange> edit(@RequestBody CourseArrange courseArrange) {
        return ResponseEntity.ok(this.courseArrangeService.update(courseArrange));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.courseArrangeService.deleteById(id));
    }
    @RequestMapping(value="courseArrangeSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String courseArrangeSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<CourseArrange> classes=courseArrangeService.courseArrangeSelectAll(pageStart,pageEnd);
        List<CourseArrange> classes1=courseArrangeService.courseArrangeSelectAllCouA();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",classes);
        jsonObject.put("count",classes1.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping("/save")
    @ResponseBody
    public DataResult<String> addCourseArrange(@RequestBody CourseArrange courseArrange){
        System.out.println("=============================");
        courseArrangeService.insert(courseArrange);
        return DataResult.succ();
    }


}

