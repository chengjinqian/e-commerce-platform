package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by chengjinqian on 2017/7/11.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

}
