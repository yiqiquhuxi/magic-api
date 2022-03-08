package com.example.magicapi.controller;

import com.example.magicapi.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author：chenqi
 * @date：2022/3/7 09:22 星期一
 * @description：
 */

@RestController
@RequestMapping("demo1")
public class DemoController {

    @Resource(name = "demoServiceImpl")
    private DemoService<Object> demoService;

    @Resource(name = "restTemplate")
    private RestTemplate restTemplate;

    @GetMapping("demo01")
    public<T> T demo01(){
        String forObject = restTemplate.getForObject("http://39.102.34.22/coder/", String.class);
        int i = 1;
        return (T) demoService.demo01();
    }

}
