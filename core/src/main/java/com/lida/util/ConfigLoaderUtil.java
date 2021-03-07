package com.lida.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author join wick
 * @version 1.0.0
 * @description config file load to cache util
 * @createDate 2021/3/7 12:20
 * @since 1.0.0
 */
public class ConfigLoaderUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigLoaderUtil.class);

    private ConfigLoaderUtil() {

    }

    /**
     * load properties with config name & default config name
     * @param configName
     * @param defaultConfigFilePath
     * @return
     */
    public static Properties loadProperties(String configName, String defaultConfigFilePath) {
        Properties config = new Properties();
        String filePath = System.getProperty(configName);
        InputStream in;

        try {
            if (null != filePath && filePath.length() > 0) {
                in = new FileInputStream(filePath);
                LOGGER.debug("load the config file from default path:{}, configName:{}", filePath, configName);
            } else {
                in = ConfigLoaderUtil.class.getResourceAsStream(defaultConfigFilePath);
            }
            config.load(in);

        } catch (Exception e) {
            LOGGER.error("load config file error, configName={}, defaultConfigFilePath={}, e={}",
                    configName, defaultConfigFilePath, e);
        }
        return config;
    }

    /**
     * load properties
     *
     * @param configFilePath String
     * @return Properties
     */
    public static Properties loadProperties(String configFilePath) {
        Properties config = new Properties();
        try {
            InputStream in = ConfigLoaderUtil.class.getResourceAsStream(configFilePath);
            config.load(in);

        } catch (Exception e) {
            LOGGER.error("load config file error, configFilePath={}, e={}", configFilePath, e);
        }
        return config;
    }
}
