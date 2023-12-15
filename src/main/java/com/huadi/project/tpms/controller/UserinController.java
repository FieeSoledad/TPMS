package com.huadi.project.tpms.controller;

import com.alibaba.fastjson.JSONObject;
import com.huadi.project.tpms.entity.Userin;
import com.huadi.project.tpms.service.UserinService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Userin)表控制层
 *
 * @author makejava
 * @since 2023-07-25 10:40:41
 */
@Controller
@RequestMapping("userin")
public class UserinController {
    /**
     * 服务对象
     */
    @Resource
    private UserinService userinService;


    /**
     * 通过主键查询单条数据
     *
     * @param userId 主键
     * @return 单条数据
     */
    @RequestMapping(value = "/queryUserinById", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<Userin> queryUserinById(@RequestParam String userId) {
        return ResponseEntity.ok(this.userinService.queryUserinById(userId));
    }

    /**
     * 新增数据
     *
     * @param userin 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Userin> add(Userin userin) {
        return ResponseEntity.ok(this.userinService.insert(userin));
    }

    /**
     * 编辑数据
     *
     * @param userin 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Userin> edit(Userin userin) {
        return ResponseEntity.ok(this.userinService.update(userin));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.userinService.deleteById(id));
    }

    @RequestMapping(value="userinSelectAll" ,method=RequestMethod.GET)
    @ResponseBody
    public String userinSelectAll(int pageIndex, int pageSize){
        int pageStart=(pageIndex-1)*pageSize;
        int pageEnd=pageSize;
        List<Userin> userin=userinService.userinSelectAll(pageStart,pageEnd);
        List<Userin> userin1=userinService.userinSelectAllUse();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",userin);
        jsonObject.put("count",userin1.size());
        return JSONObject.toJSONString(jsonObject);
    }
    //查询按钮的实现
    @RequestMapping(value = "/queryUserinByUserId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public ResponseEntity<Userin> queryUserinByUserId(@RequestParam String userId) {
        return ResponseEntity.ok(this.userinService.queryUserinByUserId(userId));
    }
    @RequestMapping(value = "/queryUserinByMajorId", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryUserinByMajorId(@RequestParam String majorId) {
        List<Userin> userins = userinService.queryUserinByMajorId(majorId);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",userins);
        jsonObject.put("count",userins.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryUserinByRole", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryUserinByRole(@RequestParam String role) {
        List<Userin> userins = userinService.queryUserinByRole(role);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",userins);
        jsonObject.put("count",userins.size());
        return JSONObject.toJSONString(jsonObject);
    }
    @RequestMapping(value = "/queryUserinByUserName", method = RequestMethod.POST)
    @ResponseBody//返回数值的修改处
    public String queryUserinByUserName(@RequestParam String userName) {
        List<Userin> userins = userinService.queryUserinByUserName(userName);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("data",userins);
        jsonObject.put("count",userins.size());
        return JSONObject.toJSONString(jsonObject);
    }


}

