package com.lida.entity;

/**
 * @author join wick
 * @version 1.0.0
 * @description user management bean
 * @createDate 2021/3/7 10:41
 * @since 1.0.0
 */
public class UserManagementEntity {
    private String userId;
    private String userName;
    private String userType;
    private String password;
    private String userStatus;
    private String address;
    private int zipCode;
    private String telePhone;
    private String email;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserManagementEntity{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userType='" + userType + '\'' +
                ", password='" + password + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", address='" + address + '\'' +
                ", zipCode=" + zipCode +
                ", telePhone='" + telePhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
