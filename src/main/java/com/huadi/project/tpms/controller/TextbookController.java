package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.Textbook;
import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.service.TextbookService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Textbook)表控制层
 *
 * @author makejava
 * @since 2023-07-25 10:48:09
 */
@Controller
@RequestMapping("textbook")
public class TextbookController {
    /**
     * 服务对象
     */
    @Resource
    private TextbookService textbookService;


    /**
     * 通过主键查询单条数据
     *
     * @param isbn 主键
     * @return 单条数据
     */
    @RequestMapping(value = "/queryTextbookById", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<Textbook> queryTextbookById(@RequestParam String isbn) {
        return ResponseEntity.ok(this.textbookService.queryTextbookById(isbn));
    }

    /**
     * 新增数据
     *
     * @param textbook 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Textbook> add(Textbook textbook) {
        return ResponseEntity.ok(this.textbookService.insert(textbook));
    }

    /**
     * 编辑数据
     *
     * @param textbook 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Textbook> edit(@RequestBody Textbook textbook) {
        return ResponseEntity.ok(this.textbookService.update(textbook));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.textbookService.deleteById(id));
    }
    //查询全部数据库中的内容
    @RequestMapping(value="textbookSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String textbookSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<Textbook> textbook=textbookService.textbookSelectAll(pageStart,pageEnd);
        List<Textbook> textbook1=textbookService.textbookSelectAllTex();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",textbook);
        jsonObject.put("count",textbook1.size());
        return JSONObject.toJSONString(jsonObject);
    }
    //查询按钮的实现
    @RequestMapping(value = "/queryTextbookByISBN", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<Textbook> queryTextbookByISBN(@RequestParam String isbn) {
        return ResponseEntity.ok(this.textbookService.queryTextbookByISBN(isbn));
    }
    @RequestMapping(value = "/queryTextbookByCourseId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryTextbookByCourseId(@RequestParam String courseId) {
        List<Textbook> textbooks = textbookService.queryTextbookByCourseId(courseId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",textbooks);
        jsonObject.put("count",textbooks.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryTextbookByTextbookName", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<Textbook> queryTextbookByTextbookName(@RequestParam String textbookName) {
        return ResponseEntity.ok(this.textbookService.queryTextbookByTextbookName(textbookName));
    }
    @RequestMapping(value = "/queryTextbookByTextbookQuantity", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryTextbookByTextbookQuantity(@RequestParam Integer textbookQuantity) {
        List<Textbook> textbooks = textbookService.queryTextbookByTextbookQuantity(textbookQuantity);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",textbooks);
        jsonObject.put("count",textbooks.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryTextbookByTextbookPublisher", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryTextbookByTextbookPublisher(@RequestParam String textbookPublisher) {
        List<Textbook> textbooks = textbookService.queryTextbookByTextbookPublisher(textbookPublisher);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",textbooks);
        jsonObject.put("count",textbooks.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryTextbookByTextbookLocation", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryTextbookByTextbookLocation(@RequestParam String textbookLocation) {
        List<Textbook> textbooks = textbookService.queryTextbookByTextbookLocation(textbookLocation);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",textbooks);
        jsonObject.put("count",textbooks.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping("/save")
    @ResponseBody
    public DataResult<String> addTextbook(@RequestBody Textbook textbook){
        textbookService.insert(textbook);
        return DataResult.succ();
    }



}

