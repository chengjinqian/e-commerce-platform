package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.vo.CartVo;

/**
 * Created by chengjinqian on 2017/7/19.
 */
public interface ICartService {

    ServerResponse<CartVo> list (Integer userId);

    ServerResponse<CartVo> add(Integer userId,Integer productId,Integer count);
}
