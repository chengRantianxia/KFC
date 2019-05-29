package com.guangc.kfc.kfc.service;


import com.guangc.kfc.kfc.bean.User;

import java.util.List;

public interface IUserService {

    public List<User> findAll();

    public User findUserById(Long id);

    public void saveOrupdateUser(User user);

    public void deleteUserById(Long id);

    public List<User> findUsersBycondition(User user);
}
