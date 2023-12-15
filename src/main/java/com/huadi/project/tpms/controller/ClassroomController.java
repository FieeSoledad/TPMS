package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.Classroom;
import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.service.ClassroomService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Classroom)表控制层
 *
 * @author makejava
 * @since 2023-07-25 11:04:58
 */
@Controller
@RequestMapping("classroom")
public class ClassroomController {
    /**
     * 服务对象
     */
    @Resource
    private ClassroomService classroomService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Classroom> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.classroomService.queryById(id));
    }

    @RequestMapping(value="classroomSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String classroomSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<Classroom> classroom=classroomService.classroomSelectAll(pageStart,pageEnd);
        List<Classroom> classroom1=classroomService.classroomSelectAllClaR();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",classroom);
        jsonObject.put("count",classroom1.size());
        return JSONObject.toJSONString(jsonObject);
    }

    /**
     * 新增数据
     *
     * @param classroom 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Classroom> add(Classroom classroom) {
        return ResponseEntity.ok(this.classroomService.insert(classroom));
    }

    /**
     * 编辑数据
     *
     * @param classroom 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Classroom> edit(@RequestBody Classroom classroom) {
        return ResponseEntity.ok(this.classroomService.update(classroom));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.classroomService.deleteById(id));
    }
    //查询按钮的实现
    @RequestMapping(value = "/queryClassroomByClassroomId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<Classroom> queryClassroomByClassroomId(@RequestParam String classroomId) {
        return ResponseEntity.ok(this.classroomService.queryClassroomByClassroomId(classroomId));
    }

    @RequestMapping(value = "/queryClassroomByClassroomSize", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryClassroomByClassroomSize(@RequestParam String classroomSize) {
        List<Classroom> classrooms = classroomService.queryClassroomByClassroomSize(classroomSize);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",classrooms);
        jsonObject.put("count",classrooms.size());
        return JSONObject.toJSONString(jsonObject);
    }

    @RequestMapping(value = "/queryClassroomByClassroomPlace", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryClassroomByClassroomPlace(@RequestParam String classroomPlace) {
        List<Classroom> classrooms = classroomService.queryClassroomByClassroomPlace(classroomPlace);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",classrooms);
        jsonObject.put("count",classrooms.size());
        return JSONObject.toJSONString(jsonObject);
    }

    @RequestMapping(value = "/queryClassroomByClassroomType", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryClassroomByClassroomType(@RequestParam String classroomType) {
        List<Classroom> classrooms = classroomService.queryClassroomByClassroomType(classroomType);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",classrooms);
        jsonObject.put("count",classrooms.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @Resource
    private ClassroomService addClsaaroonService;

    @RequestMapping("/save")
    @ResponseBody
    public DataResult<String> addClassroom(@RequestBody Classroom classroom){

        addClsaaroonService.insert(classroom);
        return DataResult.succ();
    }

}

