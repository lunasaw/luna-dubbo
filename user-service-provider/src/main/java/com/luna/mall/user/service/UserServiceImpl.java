package com.luna.mall.user.service;

import com.luna.mall.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author luna
 * 2021/6/4
 */
@DubboService(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public String ins(String ins) {
        return "UserServiceImpl----insert" + ins;
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
