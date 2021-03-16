package com.lida.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author join wick
 * @version 1.0.0
 * @description controller test
 * @createDate 2021/3/8 20:24
 * @since 1.0.0
 */
@Controller
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/index")
    public String user(Model model){
        LOGGER.debug("call index page");
        model.addAttribute("title", "欢迎使用考勤管理系统");
        return "index";
    }
}
