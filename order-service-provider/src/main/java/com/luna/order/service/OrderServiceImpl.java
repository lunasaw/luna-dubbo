package com.luna.order.service;

import com.luna.mall.service.OrderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author luna
 */
@DubboService(version = "1.0.0", interfaceClass = OrderService.class)
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String ins(String userId) {
        return "insert====>" + userId;
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
