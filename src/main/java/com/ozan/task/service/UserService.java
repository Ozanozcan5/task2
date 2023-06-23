package com.ozan.task.service;

import com.ozan.task.dto.LoginDto;
import com.ozan.task.model.UserDetail;
import com.ozan.task.response.LoginResponse;

public interface UserService {
    public UserDetail createUser(UserDetail user);

    public boolean checkEmail(String email);



}
