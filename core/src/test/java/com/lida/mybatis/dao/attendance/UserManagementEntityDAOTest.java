package com.lida.mybatis.dao.attendance;

import com.lida.entity.UserManagementEntity;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author join wick
 * @version 1.0.0
 * @description
 * @createDate 2021/3/7 15:20
 * @since 1.0.0
 */
@FixMethodOrder(value = MethodSorters.NAME_ASCENDING)
public class UserManagementEntityDAOTest {
    private final UserManagementEntityDAO userManagementEntityDAO = new UserManagementEntityDAO();

    String userId = "99999999";
    String userName = "test_admin";
    String userType = "9";
    String userStatus = "9";
    String password = "password";
    String address = "Pudong new area";
    String telephone = "13112345678";
    UserManagementEntity userManagementEntity = new UserManagementEntity();

    @Before
    public void setUp() {
        userManagementEntity.setUserId(userId);
        userManagementEntity.setUserName(userName);
        userManagementEntity.setUserType(userType);
        userManagementEntity.setUserStatus(userStatus);
        userManagementEntity.setPassword(password);
        userManagementEntity.setAddress(address);
        userManagementEntity.setTelePhone(telephone);
    }

    @Test
    public void fixOrder001_insert() {
        int insertRes = userManagementEntityDAO.insert(userManagementEntity);
        assertEquals(1, insertRes);
    }

    @Test
    public void fixOrder002_selectByUserType() {
        List<UserManagementEntity> userManagementEntityList = userManagementEntityDAO.selectByUserType(userType);
        assertEquals(1, userManagementEntityList.size());
        assertEquals(telephone, userManagementEntityList.get(0).getTelePhone());
    }

    @Test
    public void fixOrder003_deleteByUserId() {
        int deleteRes = userManagementEntityDAO.deleteByUserId(userId);
        assertEquals(1, deleteRes);
    }
}