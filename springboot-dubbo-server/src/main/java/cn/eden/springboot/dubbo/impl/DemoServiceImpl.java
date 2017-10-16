package cn.eden.springboot.dubbo.impl;

import cn.eden.springboot.dubbo.DemoService;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoService
{

    @Override
    public String sayHello(String name)
    {
        return "Hello " + name;
    }
}
