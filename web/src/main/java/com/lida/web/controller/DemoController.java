package com.lida.web.controller;

import com.lida.entity.CommunicationEntity;
import com.lida.entity.EnumEntity;
import com.lida.entity.UserManagementEntity;
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
    public UserManagementEntity test() {
        LOGGER.info("用户访问 test api");
        UserManagementEntity userManagementEntity = new UserManagementEntity();
        userManagementEntity.setUserID("10001");
        userManagementEntity.setUserName("join");
        userManagementEntity.setUserType(EnumEntity.UserType.ADMIN.getValue());
        userManagementEntity.setUserStatus(EnumEntity.UserStatus.REGISTER.getValue());
        CommunicationEntity communicationEntity = new CommunicationEntity();
        communicationEntity.setAddress("pudong new area");
        communicationEntity.setTelePhone("+86 021 66666666");
        userManagementEntity.setCommunicationEntity(communicationEntity);
        return userManagementEntity;
    }
}
