//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.springmvc.controller;

import java.io.Serializable;
import java.util.ArrayList;

public class User extends ArrayList<User> implements Serializable {
    private int class_id;
    private String name;
    private String phone;
    private String right;
    private String password;
    private String email;

    public User(int class_id, String name, String phone, String right, String password, String email) {
        this.class_id = class_id;
        this.name = name;
        this.phone = phone;
        this.right = right;
        this.password = password;
        this.email = email;
    }

    public User() {
    }

    public String toString() {
        return "User [class_id=" + this.class_id + ", name=" + this.name + ", phone=" + this.phone + ", right=" + this.right + ", password=" + this.password + ", email=" + this.email + "]";
    }

    public int getClass_id() {
        return this.class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRight() {
        return this.right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
