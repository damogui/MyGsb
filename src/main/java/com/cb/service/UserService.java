package com.cb.service;

;
import com.cb.dao.UserMapper;
import com.cb.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class UserService  {

    @Resource
    private UserMapper userDao;
    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }
}
