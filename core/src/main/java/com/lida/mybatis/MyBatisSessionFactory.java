package com.lida.mybatis;

import com.lida.util.ConfigLoaderUtil;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Map;
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
    private static final Properties PROPERTIES = ConfigLoaderUtil.loadProperties("config.path","/mybatis-config.properties");

    private static final Map<DBEnvironment, SqlSessionFactory> sessionFactoryMap = new ConcurrentHashMap<>();

    public static SqlSessionFactory getSqlSessionFactory(DBEnvironment dbEnvironment){
        if(!sessionFactoryMap.containsKey(dbEnvironment)){
            synchronized (dbEnvironment){
                if(!sessionFactoryMap.containsKey(dbEnvironment)){
                    sessionFactoryMap.put(dbEnvironment,getSqlSessionFactory(dbEnvironment.getEnvironment(), PROPERTIES));
                }
            }
        }
        return sessionFactoryMap.get(dbEnvironment);
    }

    private static SqlSessionFactory getSqlSessionFactory(String environment, Properties properties){
        InputStream inputStream = MyBatisSessionFactory.class.getClassLoader().getResourceAsStream(MYBATIS_CONFIG_XML);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,environment,properties);
        LOGGER.info("load filePath={}, environment={},properties={},create sqlSessionFactory:{}" ,
                MyBatisSessionFactory.class.getClassLoader().getResource(MYBATIS_CONFIG_XML).getPath(),
                environment,
                properties,
                sqlSessionFactory);
        return sqlSessionFactory;
    }
}
