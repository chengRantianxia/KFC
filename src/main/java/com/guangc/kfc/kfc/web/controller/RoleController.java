package com.guangc.kfc.kfc.web.controller;

import com.guangc.kfc.kfc.bean.Role;
import com.guangc.kfc.kfc.service.IRoleService;
import com.guangc.kfc.kfc.utils.Message;
import com.guangc.kfc.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @GetMapping("findAll")
    public Message findAll(){
        List<Role> list=roleService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("findRoleById")
    public Message findRoleById(Long id){
       Role role=roleService.findRoleById(id);
        return MessageUtil.success(role);
    }

    @PostMapping("saveOrupdateRole")
    public Message saveOrupdateRole(Role role){
        roleService.saveOrupdateRole(role);
        return MessageUtil.success("success");
    }

    @GetMapping("deleteRoleById")
    public Message deleteRoleById(Long id){
        roleService.deleteRoleById(id);
        return MessageUtil.success("success");
    }
}
