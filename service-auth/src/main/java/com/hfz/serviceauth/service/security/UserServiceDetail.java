package com.hfz.serviceauth.service.security;

import com.hfz.serviceauth.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author youjin
 * @Description:
 * @date 2018-06-07-14:01
 */
@Service
public class UserServiceDetail implements UserDetailsService {

    @Autowired
    private UserDao userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username);
    }
}
