package com.guangc.kfc.kfc.service;



import com.guangc.kfc.kfc.bean.Role;

import java.util.List;

public interface IRoleService {

    List<Role> findAll();

    public Role findRoleById(Long id);

    public void saveOrupdateRole(Role role);


    public void deleteRoleById(Long id);
}
