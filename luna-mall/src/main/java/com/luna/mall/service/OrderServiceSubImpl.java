package com.luna.mall.service;

import com.luna.common.text.StringUtils;

/**
 * @author luna
 * 2021/6/4
 */
public class OrderServiceSubImpl implements OrderService {

    private final OrderService orderService;

    /**
     * 传入orderService 的远程代理对象 于业务无关的判断可以放在这里
     *
     * @param orderService
     */
    public OrderServiceSubImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public String ins(String userId) {
        if (StringUtils.isEmpty(userId)) {
            return "userId is empty";
        }
        return orderService.ins(userId);
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
