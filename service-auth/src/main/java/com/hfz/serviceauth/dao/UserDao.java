package com.hfz.serviceauth.dao;

import com.hfz.serviceauth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author youjin
 * @Description:
 * @date 2018-06-07-13:57
 */
public interface UserDao extends JpaRepository<User,Long>{
    User findByUsername(String username);
}
