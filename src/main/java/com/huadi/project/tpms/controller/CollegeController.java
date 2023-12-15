package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.College;
import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.service.CollegeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (College)表控制层
 *
 * @author makejava
 * @since 2023-07-25 11:06:19
 */
@Controller
@RequestMapping("college")
public class CollegeController {
    /**
     * 服务对象
     */
    @Resource
    private CollegeService collegeService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<College> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.collegeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param college 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<College> add(College college) {
        return ResponseEntity.ok(this.collegeService.insert(college));
    }

    /**
     * 编辑数据
     *
     * @param college 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<College> edit(@RequestBody College college) {
        return ResponseEntity.ok(this.collegeService.update(college));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.collegeService.deleteById(id));
    }
    @RequestMapping(value="collegeSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String collegeSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<College> college=collegeService.collegeSelectAll(pageStart,pageEnd);
        List<College> college1=collegeService.collegeSelectAllCol();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",college);
        jsonObject.put("count",college1.size());
        return JSONObject.toJSONString(jsonObject);
    }

    //查询按钮的实现
    @RequestMapping(value = "/queryCollegeByCollegeId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<College> queryCollegeByCollegeId(@RequestParam String collegeId) {
        return ResponseEntity.ok(this.collegeService.queryCollegeByCollegeId(collegeId));
    }

    @RequestMapping(value = "/queryCollegeByCollegePlace", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryCollegeByCollegePlace(@RequestParam String collegePlace) {
        List<College> classrooms = collegeService.queryCollegeByCollegePlace(collegePlace);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",classrooms);
        jsonObject.put("count",classrooms.size());
        return JSONObject.toJSONString(jsonObject);
    }

    @RequestMapping(value = "/queryCollegeByCollegeName", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<College> queryCollegeByCollegeName(@RequestParam String collegeName) {
        return ResponseEntity.ok(this.collegeService.queryCollegeByCollegeName(collegeName));
    }

    @Resource
    private CollegeService addCollegeService;

    @RequestMapping("/save")
    @ResponseBody
    public DataResult<String> addCollege(@RequestBody College college){
        addCollegeService.insert(college);
        return DataResult.succ();
    }


}

