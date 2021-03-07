package com.lida.mybatis.dao.attendance;

import com.lida.entity.UserManagementEntity;
import com.lida.mybatis.AttendanceAbstractDAOImpl;
import com.lida.mybatis.mapper.attendance.UserManagementEntityMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author join wick
 * @version 1.0.0
 * @description user management dao
 * @createDate 2021/3/7 10:41
 * @since 1.0.0
 */
public class UserManagementEntityDAO extends AttendanceAbstractDAOImpl implements UserManagementEntityMapper {
    @Override
    public int insert(UserManagementEntity userManagementEntity) {
        try (SqlSession sqlSession = getSqlSessionFactory().openSession()) {
            UserManagementEntityMapper mapper = sqlSession.getMapper(UserManagementEntityMapper.class);
            int insertRes = mapper.insert(userManagementEntity);
            sqlSession.commit();
            return insertRes;
        }
    }

    @Override
    public List<UserManagementEntity> selectByUserType(String userType) {
        try (SqlSession sqlSession = getSqlSessionFactory().openSession()) {
            UserManagementEntityMapper mapper = sqlSession.getMapper(UserManagementEntityMapper.class);
            return mapper.selectByUserType(userType);
        }
    }

    @Override
    public int deleteByUserId(String userId) {
        try (SqlSession sqlSession = getSqlSessionFactory().openSession()) {
            UserManagementEntityMapper mapper = sqlSession.getMapper(UserManagementEntityMapper.class);
            int deleteRes = mapper.deleteByUserId(userId);
            sqlSession.commit();
            return deleteRes;
        }
    }
}
