package com.lida.mybatis;

import com.lida.util.ConfigLoaderUtil;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author join wick
 * @version 1.0.0
 * @description mybatis session factory
 * @createDate 2021/3/7 12:15
 * @since 1.0.0
 */
public class MyBatisSessionFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisSessionFactory.class);
    private static final String MYBATIS_CONFIG_XML = "mybatis-config.xml";
    private static final Properties PROPERTIES = ConfigLoaderUtil.loadProperties("config.path", "/mybatis-config.properties");

    private static final Map<DBEnvironment, SqlSessionFactory> SESSION_FACTORY_MAP = new ConcurrentHashMap<>();

    private MyBatisSessionFactory() {
    }

    /**
     * build sql session factory from config file
     *
     * @param dbEnvironment String
     * @return SqlSessionFactory
     */
    public static SqlSessionFactory getSqlSessionFactory(DBEnvironment dbEnvironment) {
        if (!SESSION_FACTORY_MAP.containsKey(dbEnvironment)) {
            synchronized (MyBatisSessionFactory.class) {
                if (!SESSION_FACTORY_MAP.containsKey(dbEnvironment)) {
                    SESSION_FACTORY_MAP.put(dbEnvironment, getSqlSessionFactory(dbEnvironment.getEnvironment()));
                }
            }
        }
        return SESSION_FACTORY_MAP.get(dbEnvironment);
    }

    /**
     * build sql session factory from config file
     *
     * @param environment String
     * @return SqlSessionFactory
     */
    private static SqlSessionFactory getSqlSessionFactory(String environment) {
        InputStream inputStream = MyBatisSessionFactory.class.getClassLoader().getResourceAsStream(MYBATIS_CONFIG_XML);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, environment, PROPERTIES);
        LOGGER.info("load config file Path=<{}>, environment=<{}>, build sqlSessionFactory=<{}> in method<MyBatisSessionFactory: getSqlSessionFactory>",
                Objects.requireNonNull(MyBatisSessionFactory.class.getClassLoader().getResource(MYBATIS_CONFIG_XML)).getPath(),
                environment,
                sqlSessionFactory);
        return sqlSessionFactory;
    }

    /**
     * load sql session factory from config file
     *
     * @param environment String
     * @param properties  Properties
     * @return SqlSessionFactory
     */
    private static SqlSessionFactory getSqlSessionFactory(String environment, Properties properties) {
        InputStream inputStream = MyBatisSessionFactory.class.getClassLoader().getResourceAsStream(MYBATIS_CONFIG_XML);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, environment, properties);
        LOGGER.info("load config file Path=<{}>, environment=<{}>, properties=<{}>, build sqlSessionFactory=<{}> in method<MyBatisSessionFactory: getSqlSessionFactory>",
                Objects.requireNonNull(MyBatisSessionFactory.class.getClassLoader().getResource(MYBATIS_CONFIG_XML)).getPath(),
                environment,
                properties,
                sqlSessionFactory);
        return sqlSessionFactory;
    }
}
