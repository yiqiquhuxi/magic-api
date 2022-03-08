package com.example.magicapi.service;

/**
 * @author：chenqi
 * @date：2022/3/7 09:23 星期一
 * @description：
 */

public interface DemoService<T> {

    default <T> T demo01() {
        return (T) "demo";
    }

}
