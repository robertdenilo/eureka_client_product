package com.eureka_client.eureka_client.Controller;

import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/*
@Author Ming Zhou
@Date: 2018/11/16 16:42
*/
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(HttpServletRequest req){

        Cookie[] cookies = req.getCookies();
        return "ok ok test ok 2";
    }
}
