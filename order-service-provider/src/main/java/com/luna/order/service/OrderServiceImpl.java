package com.luna.order.service;

import com.luna.mall.service.OrderService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0", interfaceClass = OrderService.class)
public class OrderServiceImpl implements OrderService {
    @Override
    public void ins() {
        System.out.println("insert");
    }

    @Override
    public void del() {
        System.out.println("delete");
    }

    @Override
    public void upd() {
        System.out.println("update");
    }

    @Override
    public void sel() {
        System.out.println("select");
    }
}
