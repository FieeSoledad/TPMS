package com.example.api.client;


import com.example.api.client.fallback.UserClientFallbackFactory;
import com.example.api.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: HSL
 * @Description:
 * @Version:
 **/

@FeignClient(value = "user-server",fallbackFactory = UserClientFallbackFactory.class)
public interface UserClient {
    @GetMapping("/user")
    Result selectUserById(@RequestParam("userid") int userid);
}
