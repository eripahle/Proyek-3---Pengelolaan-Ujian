/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jtk.pengelolaanujian.entity;

import com.jtk.pengelolaanujian.facade.RoleFacade;
import java.util.List;

/**
 *
 * @author pahlevi
 */
public class User {

    private String stafNIP;
    private String userUsername;
    private String userPassword;
    private List<Role> roleList;

    public User() {

    }

    public String getStafNIP() {

        return stafNIP;
    }

    public void setStafNIP(String stafNIP) {
        this.stafNIP = stafNIP;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public List<Role> getRoleList() {
        RoleFacade roleControler = new RoleFacade();
        roleList = roleControler.findByKodeStafNIP(this.getStafNIP());
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

}
