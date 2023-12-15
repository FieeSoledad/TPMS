package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.Score;
import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.service.ScoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Score)表控制层
 *
 * @author makejava
 * @since 2023-07-25 10:51:58
 */
@Controller
@RequestMapping("score")
public class ScoreController {
    /**
     * 服务对象
     */
    @Resource
    private ScoreService scoreService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Score> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.scoreService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param score 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Score> add(Score score) {
        return ResponseEntity.ok(this.scoreService.insert(score));
    }

    /**
     * 编辑数据
     *
     * @param score 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Score> edit(@RequestBody Score score) {
        return ResponseEntity.ok(this.scoreService.update(score));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.scoreService.deleteById(id));
    }


    //查询数据库中的内容
    @RequestMapping(value="scoreSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String scoreSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<Score> score=scoreService.scoreSelectAll(pageStart,pageEnd);
        List<Score> score1=scoreService.scoreSelectAllSco();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",score);
        jsonObject.put("count",score1.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping("/save")
    @ResponseBody
    public DataResult<String> addScore(@RequestBody Score scores){
        scoreService.insert(scores);
        return DataResult.succ();
    }
    @RequestMapping(value = "/queryScoreByStudentId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryScoreByStudentId(@RequestParam String studentId) {
        List<Score> scores = scoreService.queryScoreByStudentId(studentId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",scores);
        jsonObject.put("count",scores.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryScoreByCourseId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryScoreByCourseId(@RequestParam String courseId) {
        List<Score> scores = scoreService.queryScoreByCourseId(courseId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",scores);
        jsonObject.put("count",scores.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryScoreByScoreId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryScoreByScoreId(@RequestParam Integer score) {
        List<Score> scores = scoreService.queryScoreByScoreId(score);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",scores);
        jsonObject.put("count",scores.size());
        return JSONObject.toJSONString(jsonObject);
    }

}

