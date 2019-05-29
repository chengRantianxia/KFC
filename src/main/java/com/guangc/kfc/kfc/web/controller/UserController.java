package com.guangc.kfc.kfc.web.controller;

import com.guangc.kfc.kfc.bean.User;
import com.guangc.kfc.kfc.service.IUserService;
import com.guangc.kfc.kfc.utils.Message;
import com.guangc.kfc.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("findAll")
    public Message findAll(){
        List<User> list=userService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("findByUserId")
    public Message findUserById(Long id){
        User user=userService.findUserById(id);
        return MessageUtil.success(user);
    }

    @PostMapping("saveOrupdateUser")
    public Message saveOrupdateUser(User user){
        userService.saveOrupdateUser(user);
        return MessageUtil.success("success");
    }

    @GetMapping("deleteByUserId")
    public Message deleteUserById(Long id){
        userService.deleteUserById(id);
        return MessageUtil.success("success");
    }

    @GetMapping("findUsersBycondition")
    public Message findUsersBycondition(User user){
        List<User> list=userService.findUsersBycondition(user);
        return MessageUtil.success(list);
    }


}
