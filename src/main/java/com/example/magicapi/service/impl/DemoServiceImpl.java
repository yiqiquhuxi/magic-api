package com.example.magicapi.service.impl;

import com.example.magicapi.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author：chenqi
 * @date：2022/3/7 09:24 星期一
 * @description：
 */
@Service("demoServiceImpl")
public class DemoServiceImpl implements DemoService<Object> {

    @Override
    public <T> T demo01() {
        return (T) "success";
    }
}
