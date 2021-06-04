package com.luna.mall.user.controller;

import com.luna.mall.service.OrderService;
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
public class UserController {

    @DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:8002", check = false)
    private OrderService orderService;

    @GetMapping("/ins")
    public String ins() {
        orderService.ins("userId");
        return "ins";
    }

    @GetMapping("/del")
    public String del() {
        orderService.del();
        return "del";
    }

    @GetMapping("/upd")
    public String upd() {
        orderService.upd();
        return "upd";
    }

    @GetMapping("/sel")
    public String sel() {
        orderService.sel();
        return "sel";
    }

}
