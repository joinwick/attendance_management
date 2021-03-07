package com.lida.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author join wick
 * @version 1.0.0
 * @description
 * @createDate 2021/3/7 10:05
 * @since 1.0.0
 */
public class StringUtilTest {

    @Test
    public void isEmpty_NullStr() {
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void isEmpty_EmptyStr() {
        assertTrue(StringUtil.isEmpty(""));
    }
}