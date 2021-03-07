package com.lida.entity;

/**
 * @author join wick
 * @version 1.0.0
 * @description user management bean
 * @createDate 2021/3/7 10:41
 * @since 1.0.0
 */
public class UserManagementEntity {
    private String userID;
    private String userName;
    private String userType;
    private String password;
    private String userStatus;
    private CommunicationEntity communicationEntity;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public CommunicationEntity getCommunicationEntity() {
        return communicationEntity;
    }

    public void setCommunicationEntity(CommunicationEntity communicationEntity) {
        this.communicationEntity = communicationEntity;
    }

    @Override
    public String toString() {
        return "UserManagementEntity{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", userType='" + userType + '\'' +
                ", password='" + password + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", communicationEntity=" + communicationEntity +
                '}';
    }
}
