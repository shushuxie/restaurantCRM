package com.restaurant.menu.controller;

import com.restaurant.menu.service.MenuUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author 谢树树
 * @date 24/6/2021 下午10:42
 */

@Controller("/menu")
public class MenuUserController {

    @Resource
    private MenuUserService service;

    @RequestMapping("/getAllMenu")
    public void getAllMenu(Model model){
        service.getAllUser();
    }
}
