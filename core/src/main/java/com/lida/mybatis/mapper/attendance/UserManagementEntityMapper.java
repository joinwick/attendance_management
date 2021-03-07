package com.lida.mybatis.mapper.attendance;

import com.lida.entity.UserManagementEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author join wick
 * @version 1.0.0
 * @description user management mapper
 * @createDate 2021/3/7 10:40
 * @since 1.0.0
 */
public interface UserManagementEntityMapper {

    /**
     * insert method
     *
     * @param userManagementEntity UserManagementEntity
     * @return int
     */
    int insert(UserManagementEntity userManagementEntity);

    /**
     * query user by userType
     *
     * @param userType String
     * @return List<UserManagementEntity>
     */
    List<UserManagementEntity> selectByUserType(@Param("userType") String userType);

    /**
     * delete by user id
     *
     * @param userId String
     * @return int
     */
    int deleteByUserId(@Param("userId") String userId);
}
