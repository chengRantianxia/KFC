package com.guangc.kfc.kfc.service.impl;

import com.guangc.kfc.kfc.bean.User;
import com.guangc.kfc.kfc.bean.UserExample;
import com.guangc.kfc.kfc.mapper.UserMapper;
import com.guangc.kfc.kfc.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        UserExample example=new UserExample();
        List<User> list=userMapper.selectByExample(example);
        return list;
    }

    @Override
    public User findUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdateUser(User user) {
        if(user.getId()!=null){
            userMapper.updateByPrimaryKey(user);
        }else {
            userMapper.insert(user);
        }
    }

    @Override
    public void deleteUserById(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<User> findUsersBycondition(User user) {
        UserExample ex=new UserExample();
        ex.createCriteria().andNameLike("%"+user.getName()+"%").andPhotoLike("%"+user.getPhoto()+"%").
                andTelephoneLike("%"+user.getTelephone()+"%");
        return userMapper.selectByExample(ex);
    }
}
