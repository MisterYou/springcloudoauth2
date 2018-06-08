package com.hfz.servicehi.dao;

import com.hfz.servicehi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
