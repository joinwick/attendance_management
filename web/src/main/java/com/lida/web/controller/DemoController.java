package com.lida.web.controller;

import com.lida.entity.DemoEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author join wick
 * @version 1.0.0
 * @description demo controller
 * @createDate 2021/3/6 23:13
 * @since 1.0.0
 */
@Controller
public class DemoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/test")
    @ResponseBody
    public DemoEntity test() {
        LOGGER.info("用户访问 test api");
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setName("小强");
        demoEntity.setAge(24);
        return demoEntity;
    }
}
