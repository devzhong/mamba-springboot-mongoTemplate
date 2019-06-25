package com.mamba.smongoTemplate.service;

import com.mamba.smongoTemplate.dao.UserDao;
import com.mamba.smongoTemplate.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * desc:
 * author:devzhong
 * Date:2019/6/25 15:12
 */
@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    public String saveObj(User user){
        userDao.save(user);
        return "添加成功";
    }
}
