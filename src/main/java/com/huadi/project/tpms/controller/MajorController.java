package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.Major;
import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.service.MajorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Major)表控制层
 *
 * @author makejava
 * @since 2023-07-25 10:54:17
 */
@Controller
@RequestMapping("major")
public class MajorController {
    /**
     * 服务对象
     */
    @Resource
    private MajorService majorService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Major> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.majorService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param major 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Major> add(Major major) {
        return ResponseEntity.ok(this.majorService.insert(major));
    }

    /**
     * 编辑数据
     *
     * @param major 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Major> edit(@RequestBody Major major) {
        return ResponseEntity.ok(this.majorService.update(major));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.majorService.deleteById(id));
    }


    @RequestMapping(value="majorSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String majorSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<Major> major=majorService.majorSelectAll(pageStart,pageEnd);
        List<Major> major1=majorService.majorSelectAllMaj();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",major);
        jsonObject.put("count",major1.size());
        return JSONObject.toJSONString(jsonObject);
    }

    //查询按钮的实现
    @RequestMapping(value = "/queryMajorByMajorId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryMajorByMajorId(@RequestParam String majorId) {
        List<Major> majors = majorService.queryMajorByMajorId(majorId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",majors);
        jsonObject.put("count",majors.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryMajorByCollegeId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryMajorByCollegeId(@RequestParam String collegeId) {
        List<Major> majors = majorService.queryMajorByCollegeId(collegeId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",majors);
        jsonObject.put("count",majors.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryMajorByMajorName", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryMajorByMajorName(@RequestParam String majorName) {
        List<Major> majors = majorService.queryMajorByMajorName(majorName);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",majors);
        jsonObject.put("count",majors.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping("/save")
    @ResponseBody
    public DataResult<String> addMajor(@RequestBody Major major){
        majorService.insert(major);
        return DataResult.succ();
    }
}

