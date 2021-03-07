package com.lida.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author join wick
 * @version 1.0.0
 * @description abstract dao
 * @createDate 2021/3/7 14:58
 * @since 1.0.0
 */
public interface AbstractDAOService {
    /**
     * get sql session factory
     *
     * @return SqlSessionFactory
     */
    SqlSessionFactory getSqlSessionFactory();
}
