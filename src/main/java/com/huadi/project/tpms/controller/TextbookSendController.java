package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.TextbookSend;
import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.service.TextbookSendService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TextbookSend)表控制层
 *
 * @author makejava
 * @since 2023-07-25 10:42:49
 */
@Controller
@RequestMapping("textbookSend")
public class TextbookSendController {
    /**
     * 服务对象
     */
    @Resource
    private TextbookSendService textbookSendService;




    /**
     * 通过主键查询单条数据
     *
     * @param classId 主键
     * @return 单条数据
     */
    @RequestMapping(value = "/queryTextbookSendById", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<TextbookSend> queryTextbookSendById(@RequestParam String classId) {
        return ResponseEntity.ok(this.textbookSendService.queryTextbookSendById(classId));
    }

    /**
     * 新增数据
     *
     * @param textbookSend 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TextbookSend> add(TextbookSend textbookSend) {
        return ResponseEntity.ok(this.textbookSendService.insert(textbookSend));
    }

    /**
     * 编辑数据
     *
     * @param textbookSend 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TextbookSend> edit(@RequestBody TextbookSend textbookSend) {
        return ResponseEntity.ok(this.textbookSendService.update(textbookSend));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.textbookSendService.deleteById(id));
    }
    @RequestMapping(value="textbookSendSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String textbookSendSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<TextbookSend> textbookSend=textbookSendService.textbookSendSelectAll(pageStart,pageEnd);
        List<TextbookSend> textbookSend1=textbookSendService.textbookSendSelectAllTexS();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",textbookSend);
        jsonObject.put("count",textbookSend1.size());
        return JSONObject.toJSONString(jsonObject);
    }
    //查询按钮的实现
    @RequestMapping(value = "/queryTextbookSendByClassId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryTextbookSendByClassId(@RequestParam String classId) {
        List<TextbookSend> textbookSends = textbookSendService.queryTextbookSendByClassId(classId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",textbookSends);
        jsonObject.put("count",textbookSends.size());
        return JSONObject.toJSONString(jsonObject);
    }

    @RequestMapping(value = "/queryTextbookSendByISBN", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<TextbookSend> queryTextbookSendByISBN(@RequestParam String isbn) {
        return ResponseEntity.ok(this.textbookSendService.queryTextbookSendByISBN(isbn));
    }

    @RequestMapping(value = "/queryTextbookSendByTextbookSendNumber", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryTextbookSendByTextbookSendNumber(@RequestParam Integer textbookSendNumber) {
        List<TextbookSend> textbookSends = textbookSendService.queryTextbookSendByTextbookSendNumber(textbookSendNumber);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",textbookSends);
        jsonObject.put("count",textbookSends.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping("/save")
    @ResponseBody
    public DataResult<String> addTextbookSend(@RequestBody TextbookSend textbookSend){
        System.out.println("=============================================");
        textbookSendService.insert(textbookSend);
        return DataResult.succ();
    }

}

