package com.guangc.kfc.kfc.service.impl;

import com.guangc.kfc.kfc.bean.UserRole;
import com.guangc.kfc.kfc.bean.UserRoleExample;
import com.guangc.kfc.kfc.mapper.UserRoleMapper;
import com.guangc.kfc.kfc.service.IUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserRoleServiceImpl implements IUserRoleService {


    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> findAll() {
        UserRoleExample example=new UserRoleExample();
        List<UserRole> list=userRoleMapper.selectByExample(example);
        return list;
    }

    @Override
    public UserRole findUserRoleById(Long id) {
        return userRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdateUserRole(UserRole userRole) {
        if(userRole.getId()!=null){
            userRoleMapper.updateByPrimaryKey(userRole);
        }else {
            userRoleMapper.insert(userRole);
        }
    }

    @Override
    public void deleteUserRoleById(Long id) {
        userRoleMapper.deleteByPrimaryKey(id);
    }
}
