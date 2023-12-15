package com.huadi.project.tpms.controller;



import com.huadi.project.tpms.entity.Userin;
import com.huadi.project.tpms.service.UserinService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/verify")
public class GoIndex {
    @Resource
    UserinService userinService;

    @PostMapping("/login") // 添加映射路径为/login，处理登录请求
    public ResponseEntity<String> login(HttpSession httpSession, @RequestParam("username") String username, @RequestParam("password")String password)
    {
        Userin user = userinService.queryUserinById(username);

        if(password.equals(user.getPassword()))
        {
            httpSession.setAttribute("userId",user.getUserId());

            return ResponseEntity.ok("success");
        }
        else
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Not Found");
        }
    }
}
