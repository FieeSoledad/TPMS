package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.TextbookOrder;
import com.huadi.project.tpms.utils.result.DataResult;
import com.huadi.project.tpms.service.TextbookOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TextbookOrder)表控制层
 *
 * @author makejava
 * @since 2023-07-25 10:44:40
 */
@Controller
@RequestMapping("textbookOrder")
public class TextbookOrderController {
    /**
     * 服务对象
     */
    @Resource
    private TextbookOrderService textbookOrderService;


    /**
     * 通过主键查询单条数据
     *
     * @param textbookOrderId 主键
     * @return 单条数据
     */
    @RequestMapping(value = "/queryTextbookOrderById", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<TextbookOrder> queryTextbookOrderById(@RequestParam String textbookOrderId) {
        return ResponseEntity.ok(this.textbookOrderService.queryTextbookOrderById(textbookOrderId));
    }

    /**
     * 新增数据
     *
     * @param textbookOrder 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TextbookOrder> add(TextbookOrder textbookOrder) {
        return ResponseEntity.ok(this.textbookOrderService.insert(textbookOrder));
    }

    /**
     * 编辑数据
     *
     * @param textbookOrder 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TextbookOrder> edit(@RequestBody TextbookOrder textbookOrder) {
        return ResponseEntity.ok(this.textbookOrderService.update(textbookOrder));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.textbookOrderService.deleteById(id));
    }
    @RequestMapping(value="textbookOrderSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String textbookOrderSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<TextbookOrder> textbookOrder=textbookOrderService.textbookOrderSelectAll(pageStart,pageEnd);
        List<TextbookOrder> textbookOrder1=textbookOrderService.textbookOrderSelectAllTexO();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",textbookOrder);
        jsonObject.put("count",textbookOrder1.size());
        return JSONObject.toJSONString(jsonObject);
    }
    //查询按钮的实现
    @RequestMapping(value = "/queryTextbookOrderByTextbookOrderId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<TextbookOrder> queryTextbookOrderByTextbookOrderId(@RequestParam String textbookOrderId) {
        return ResponseEntity.ok(this.textbookOrderService.queryTextbookOrderByTextbookOrderId(textbookOrderId));
    }
    @RequestMapping(value = "/queryTextbookOrderByISBN", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<TextbookOrder> queryTextbookOrderByISBN(@RequestParam String isbn) {
        return ResponseEntity.ok(this.textbookOrderService.queryTextbookOrderByISBN(isbn));
    }
    @RequestMapping(value = "/queryTextbookOrderByTextbookOrderNumber", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryTextbookOrderByTextbookOrderNumber(@RequestParam Integer textbookOrderNumber) {
        List<TextbookOrder> textbookOrders = textbookOrderService.queryTextbookOrderByTextbookOrderNumber(textbookOrderNumber);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",textbookOrders);
        jsonObject.put("count",textbookOrders.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryTextbookOrderByTextbookOrderState", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryTextbookOrderByTextbookOrderState(@RequestParam String textbookOrderState) {
        List<TextbookOrder> textbookOrders = textbookOrderService.queryTextbookOrderByTextbookOrderState(textbookOrderState);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",textbookOrders);
        jsonObject.put("count",textbookOrders.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryTextbookOrderByTextbookOrderTime", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryTextbookOrderByTextbookOrderTime(@RequestParam String textbookOrderTime) {
        List<TextbookOrder> textbookOrders = textbookOrderService.queryTextbookOrderByTextbookOrderTime(textbookOrderTime);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",textbookOrders);
        jsonObject.put("count",textbookOrders.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryTextbookOrderByTextbookOrderPrice", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryTextbookOrderByTextbookOrderPrice(@RequestParam Integer textbookOrderPrice) {
        List<TextbookOrder> textbookOrders = textbookOrderService.queryTextbookOrderByTextbookOrderPrice(textbookOrderPrice);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",textbookOrders);
        jsonObject.put("count",textbookOrders.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping("/save")
    @ResponseBody
    public DataResult<String> addTextbookOrder(@RequestBody TextbookOrder textbookOrder){
        System.out.println("=============================");
        textbookOrderService.insert(textbookOrder);
        return DataResult.succ();
    }



}

