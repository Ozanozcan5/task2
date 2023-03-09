package com.ozan.task.service;

import com.ozan.task.model.UserDetail;

public interface UserService {
    public UserDetail createUser(UserDetail user);

    public boolean checkEmail(String email);

}
