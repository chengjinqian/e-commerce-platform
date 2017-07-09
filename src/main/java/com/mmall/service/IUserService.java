package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by chengjinqian on 2017/7/9.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);
}
