package com.ozan.task.service;


import com.ozan.task.model.UserDetail;
import com.ozan.task.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
    public class UserServiceImpl implements UserService {
        Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
        @Autowired
        private UserRepository userRepo;

        @Autowired
        private BCryptPasswordEncoder passwordEncode;

        @Override
        public UserDetail createUser(UserDetail user) {

            user.setPassword(passwordEncode.encode(user.getPassword()));
            user.setRole("ROLE_USER");
            logger.info("User Saved");
            return userRepo.save(user);
        }

        @Override
        public boolean checkEmail(String email) {

            return userRepo.existsByEmail(email);
        }

    }

