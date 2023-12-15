package com.huadi.project.tpms.controller;


import com.huadi.project.tpms.entity.Major;
import com.huadi.project.tpms.entity.Userin;
import com.huadi.project.tpms.service.MajorService;
import com.huadi.project.tpms.service.UserinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Resource
    private UserinService userinService;

    @Resource
    private MajorService majorService;

    @PostMapping("/submit")
    public String register(@RequestParam("user_id") String user_id,@RequestParam("user_name") String user_name,@RequestParam("password") String password,
                           @RequestParam("major_id") String major_id,@RequestParam("role") String role)
    {
        Userin user = new Userin();
        user.setUserId(user_id);
        user.setUserName(user_name);
        user.setPassword(password);
        user.setMajorId(major_id);
        user.setRole(role);

        Userin temp = userinService.insert(user);

        return "login";
    }

    @GetMapping("/user_id/{user_id}")
    @ResponseBody
    public String isUserIdRepeated(@PathVariable String user_id)
    {
        Userin user = userinService.queryUserinById(user_id);

        if(null==user)
        {
            return "0";
        }
        else
        {
            return "1";
        }
    }

    @GetMapping("/major_id/{major_id}")
    @ResponseBody
    public String isMajorRepeated(@PathVariable String major_id)
    {
        Major major = majorService.queryById(major_id);

        if(null==major)
        {
            return "0";
        }
        else
        {
            return "1";
        }
    }
}
