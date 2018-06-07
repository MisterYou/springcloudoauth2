package com.hfz.serviceauth.service;

import com.hfz.serviceauth.dao.UserDao;
import com.hfz.serviceauth.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author youjin
 * @Description:
 * @date 2018-06-07-13:58
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public void create(User user) {
        User existing = userDao.findByUsername(user.getUsername());
        String hash = encoder.encode(user.getPassword());
        user.setPassword(hash);
        userDao.save(user);
    }
}
