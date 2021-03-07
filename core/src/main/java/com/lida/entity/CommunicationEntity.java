package com.lida.entity;

/**
 * @author join wick
 * @version 1.0.0
 * @description communication entity
 * @createDate 2021/3/7 11:22
 * @since 1.0.0
 */
public class CommunicationEntity {
    private String address;
    private int zipCode;
    private String telePhone;
    private String email;

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
        return "CommunicationEntity{" +
                "address='" + address + '\'' +
                ", zipCode=" + zipCode +
                ", telePhone='" + telePhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
