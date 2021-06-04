package com.luna.order.controller;

import com.luna.mall.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luna
 * 2021/6/4
 */
@RestController
@RequestMapping("/api")
public class OrderController {

    @DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:8001", check = false)
    private UserService userService;

    @GetMapping("/ins")
    public String ins() {
        return userService.ins("ins");
    }

    @GetMapping("/del")
    public String del() {
        userService.del();
        return "del";
    }

    @GetMapping("/upd")
    public String upd() {
        userService.upd();
        return "upd";
    }

    @GetMapping("/sel")
    public String sel() {
        userService.sel();
        return "sel";
    }

}
