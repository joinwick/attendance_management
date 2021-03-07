package com.lida.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author join wick
 * @version 1.0.0
 * @description attendance abstract dao
 * @createDate 2021/3/7 15:01
 * @since 1.0.0
 */
public class AttendanceAbstractDAOImpl implements AbstractDAOService {
    private final SqlSessionFactory sqlSessionFactory;

    /**
     * default constructor
     */
    public AttendanceAbstractDAOImpl() {
        this.sqlSessionFactory = MyBatisSessionFactory.getSqlSessionFactory(DBEnvironment.ATTENDANCE);
    }

    @Override
    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
