package com.eureka_client.eureka_client.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@Author Ming Zhou
@Date: 2018/11/16 16:42
*/
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "ok ok test ok 2";
    }
}
