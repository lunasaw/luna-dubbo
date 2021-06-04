package com.luna.mall.controller;

import com.luna.mall.service.OrderService;
import com.luna.mall.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luna
 * 2021/6/4
 */
@RestController
@RequestMapping("/api")
public class MallController {

    @DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:8002", check = false, stub = "com.luna.mall.service.OrderServiceSubImpl")
    private OrderService orderService;

    @DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:8001", check = false)
    private UserService userService;

    @GetMapping("/order/ins")
    public String orderIns(@RequestParam(value = "userId") String userId) {
        return orderService.ins(userId);
    }

    @GetMapping("/user/ins")
    public String userIns() {
        return userService.ins("user");
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
