package com.mamba.smongoTemplate.dao;

import com.mamba.smongoTemplate.entity.User;
import org.springframework.stereotype.Repository;

/**
 * desc:
 * author:devzhong
 * Date:2019/6/25 15:10
 */
@Repository
public class UserDao extends MongoDbDao<User> {
    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }
}
