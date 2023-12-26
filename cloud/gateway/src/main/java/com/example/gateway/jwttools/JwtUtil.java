package com.example.gateway.jwttools;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.Map;

/**
 * @Title: JwtUtil.java
 * @Author: HSL
 * @Date: 2023/12/15 8:41
 * @Description:
 */
public class JwtUtil {
    private static final String SECRET = "Hello World";

    public static String generateToken(Long payload){

        // 指定签发时间、过期时间 和 签名算法，并返回token
//        String token = builder.sign(Algorithm.HMAC256(SECRET));

        return JWT.create().withSubject(String.valueOf(payload)).sign(Algorithm.HMAC256(SECRET));

    }

    public static DecodedJWT decodeToken(String token){
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
        DecodedJWT decodedJWT = jwtVerifier.verify(token);
        return decodedJWT;
    }

}
