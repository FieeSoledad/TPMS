package com.example.api.client.fallback;

import com.example.api.client.UserClient;
import com.example.api.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;

/**
 * @Title: UserClientFallbackFactory.java
 * @Author: HSL
 * @Date: 2023/12/18 17:33
 * @Description:
 */

@Slf4j//日志输出
public class UserClientFallbackFactory implements FallbackFactory<UserClient> {

    @Override
    public UserClient create(Throwable cause) {
        return new UserClient() {
            @Override
            public Result selectUserById(int userid) {
                //查询出现异常的处理逻辑
                return null;//返回空
            }
        };
    }
}
