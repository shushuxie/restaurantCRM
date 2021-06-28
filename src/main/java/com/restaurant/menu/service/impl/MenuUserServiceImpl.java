package com.restaurant.menu.service.impl;/**
 * TODO
 *
 * @author 谢树树
 * @date 21/6/2021 下午10:50
 */

import com.restaurant.menu.dao.MenuUserDao;
import com.restaurant.menu.service.MenuUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
@Service
public class MenuUserServiceImpl implements MenuUserService {
    @Resource
    private MenuUserDao menuUserDao;
    @Override
    public Map<String, Object> getAllUser() {
        return menuUserDao.getAllUser();
    }
}
