package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.Classes;
import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.service.ClassesService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Classes)表控制层
 *
 * @author makejava
 * @since 2023-07-25 11:03:28
 */
@Controller
@RequestMapping("classes")
public class ClassesController {
    /**
     * 服务对象
     */
    @Resource
    private ClassesService classesService;


    //查询全部数据的功能实现点
    @RequestMapping(value="classesSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String classesSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<Classes> classes=classesService.classesSelectAll(pageStart,pageEnd);
        List<Classes> classes1=classesService.classesSelectAllCla();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",classes);
        jsonObject.put("count",classes1.size());
        return JSONObject.toJSONString(jsonObject);
    }
    //查询按钮的实现
    @RequestMapping(value = "/queryClassByMajorId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryClassByMajorId(@RequestParam String majorId) {
        List<Classes> classes = classesService.queryClassByMajorId(majorId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",classes);
        jsonObject.put("count",classes.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryClassByClassId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryClassByClassId(@RequestParam String classId) {
        List<Classes> classes = classesService.queryClassByClassId(classId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",classes);
        jsonObject.put("count",classes.size());
        return JSONObject.toJSONString(jsonObject);
    }




    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Classes> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.classesService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param classes 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Classes> add(Classes classes) {
        return ResponseEntity.ok(this.classesService.insert(classes));
    }

    /**
     * 编辑数据
     *
     * @param classes 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Classes> edit(@RequestBody Classes classes) {
        return ResponseEntity.ok(this.classesService.update(classes));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.classesService.deleteById(id));
    }
//    增加功能的实现
@RequestMapping("/save")
@ResponseBody
public DataResult<String> addClasses(@RequestBody Classes classes){
    classesService.insert(classes);
    return DataResult.succ();
}

}

