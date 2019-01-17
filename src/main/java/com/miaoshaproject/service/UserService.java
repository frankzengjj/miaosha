package com.miaoshaproject.service;

import com.miaoshaproject.service.model.UserModel;

public interface UserService {
    // Method to get user obj by its id
    UserModel getUserById(Integer id);
}
