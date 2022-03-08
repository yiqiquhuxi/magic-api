package com.example.magicapi.func;

import org.springframework.stereotype.Component;
import org.ssssssss.magicapi.core.config.MagicFunction;
import org.ssssssss.script.annotation.Comment;
import org.ssssssss.script.annotation.Function;
import org.ssssssss.script.functions.DateExtension;

import java.util.Date;

/**
 * @author：chenqi
 * @date：2022/3/7 17:37 星期一
 * @description： 自定义函数
 */

@Component
class CustomerFunc implements MagicFunction {

    @Function
    @Comment("自定义函数：无参有返回值")
    public static Date customNow() {
        return new Date();
    }

    @Function
    @Comment("自定义函数：有参有返回值")
    public static String dateFormat(@Comment("目标日期") Date target) {
        return target == null ? null : DateExtension.format(target, "yyyy-MM-dd HH:mm:ss");
    }

    @Function
    @Comment("自定义函数：多个参数有返回值")
    public static Object ifNull(
            @Comment("目标值") Object target,
            @Comment("为空的值") Object trueValue,
            @Comment("不为空的值") Object falseValue) {
        return target == null ? trueValue : falseValue;
    }

}
