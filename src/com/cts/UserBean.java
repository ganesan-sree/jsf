package com.cts;

public class UserBean {
    private int id;
    private String name;
     
    public String addUser() {
         
        return "success";
    }   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
