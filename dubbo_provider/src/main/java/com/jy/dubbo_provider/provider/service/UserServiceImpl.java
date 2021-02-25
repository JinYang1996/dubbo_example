package com.jy.dubbo_provider.provider.service;

import com.jy.dubbo_api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName(String id) {
        System.out.println("调用provider成功！！！");
        return id;
    }
}
