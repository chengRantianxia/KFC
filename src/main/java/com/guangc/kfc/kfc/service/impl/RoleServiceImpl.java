package com.guangc.kfc.kfc.service.impl;

import com.guangc.kfc.kfc.bean.Role;
import com.guangc.kfc.kfc.bean.RoleExample;
import com.guangc.kfc.kfc.mapper.RoleMapper;
import com.guangc.kfc.kfc.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public List<Role> findAll() {
        RoleExample example=new RoleExample();
        List<Role> list=roleMapper.selectByExample(example);
        return list;
    }

    @Override
    public Role findRoleById(Long id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdateRole(Role role) {
        if(role.getId()!=null){
            roleMapper.updateByPrimaryKey(role);
        }else{
            roleMapper.insert(role);
        }
    }

    @Override
    public void deleteRoleById(Long id) {
        roleMapper.deleteByPrimaryKey(id);
    }
}
