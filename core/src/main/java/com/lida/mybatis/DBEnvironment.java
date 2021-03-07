package com.lida.mybatis;

/**
 * @author join wick
 * @version 1.0.0
 * @description DB Environment enum
 * @createDate 2021/3/7 12:11
 * @since 1.0.0
 */
public enum DBEnvironment {
    // attendance
    ATTENDANCE("attendance");

    private final String environment;

    /**
     * default constructor
     *
     * @param environment String
     */
    DBEnvironment(String environment) {
        this.environment = environment;
    }

    public String getEnvironment() {
        return environment;
    }
}
