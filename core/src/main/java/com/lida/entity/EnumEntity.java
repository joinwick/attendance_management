package com.lida.entity;

import com.lida.inter.EnumInterface;

/**
 * @author join wick
 * @version 1.0.0
 * @description enum entity
 * @createDate 2021/3/7 08:02
 * @since 1.0.0
 */
public class EnumEntity {
    /**
     * user type enum
     */
    public enum UserType implements EnumInterface {
        // admin
        ADMIN("admin", "系统管理员"),
        // attendance clerk
        ATTENDANCE_CLERK("attendance_clerk", "考勤员"),
        // assistant
        ASSISTANT("assistant", "辅导员");


        String value;
        String label;

        UserType(String value, String label) {
            this.value = value;
            this.label = label;
        }

        public static UserType getEnumByValue(String value) {
            for (UserType userType : UserType.values()) {
                if (userType.value.equals(value)) {
                    return userType;
                }
            }
            return null;
        }

        @Override
        public String getValue() {
            return this.value;
        }

        @Override
        public String getLabel() {
            return this.label;
        }
    }

    /**
     * user type enum
     */
    public enum UserStatus implements EnumInterface {
        // active
        REGISTER("register", "已注册"),
        // active
        ACTIVE("active", "已激活"),
        // withdraw
        WITHDRAW("withdraw", "已注销");

        String value;
        String label;

        UserStatus(String value, String label) {
            this.value = value;
            this.label = label;
        }

        public static UserStatus getEnumByValue(String value) {
            for (UserStatus userStatus : UserStatus.values()) {
                if (userStatus.value.equals(value)) {
                    return userStatus;
                }
            }
            return null;
        }

        @Override
        public String getValue() {
            return this.value;
        }

        @Override
        public String getLabel() {
            return this.label;
        }
    }


    /**
     * HashAlgorithm enum
     */
    public enum HashAlgorithm implements EnumInterface {
        // sha 256
        SHA256("SHA-256", "SHA256"),
        // ripe md160
        RIPEMD160("RipeMD160", "RipeMD160");

        String value;
        String label;

        HashAlgorithm(String value, String label) {
            this.value = value;
            this.label = label;
        }

        public static HashAlgorithm getEnumByValue(String value) {
            for (HashAlgorithm hashAlgorithm : HashAlgorithm.values()) {
                if (hashAlgorithm.value.equals(value)) {
                    return hashAlgorithm;
                }
            }
            return null;
        }

        @Override
        public String getValue() {
            return this.value;
        }

        @Override
        public String getLabel() {
            return this.label;
        }
    }

    public enum SecurityProvider implements EnumInterface {
        // BC
        BC("BC", "BC"),
        ;

        String value;
        String label;

        SecurityProvider(String value, String label) {
            this.value = value;
            this.label = label;
        }

        public static SecurityProvider getEnumByValue(String value) {
            for (SecurityProvider securityProvider : SecurityProvider.values()) {
                if (securityProvider.value.equals(value)) {
                    return securityProvider;
                }
            }
            return null;
        }

        @Override
        public String getValue() {
            return this.value;
        }

        @Override
        public String getLabel() {
            return this.label;
        }
    }

    public enum BaseEncodingAlgorithm implements EnumInterface {
        // base58
        BASE58("BASE58", "BASE58"),
        // base64
        BASE64("BASE64", "BASE64"),
        ;

        String value;
        String label;

        BaseEncodingAlgorithm(String value, String label) {
            this.value = value;
            this.label = label;
        }

        public static BaseEncodingAlgorithm getEnumByValue(String value) {
            for (BaseEncodingAlgorithm baseEncodingAlgorithm : BaseEncodingAlgorithm.values()) {
                if (baseEncodingAlgorithm.value.equals(value)) {
                    return baseEncodingAlgorithm;
                }
            }
            return null;
        }

        @Override
        public String getValue() {
            return this.value;
        }

        @Override
        public String getLabel() {
            return this.label;
        }
    }



}
