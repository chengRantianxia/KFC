package com.guangc.kfc.kfc.service;



import com.guangc.kfc.kfc.bean.UserRole;

import java.util.List;

public interface IUserRoleService {

    List<UserRole> findAll();

    public UserRole findUserRoleById(Long id);

    public void saveOrupdateUserRole(UserRole userRole);


    public void deleteUserRoleById(Long id);
}
