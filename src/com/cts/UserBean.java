package com.cts;

import javax.faces.context.FacesContext;

public class UserBean {
    private int id;
    private String name;
    
    
    
    
    
     
    public String addUser() {
    
    	FacesContext facesContext = FacesContext.getCurrentInstance();
    	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&77");
    	System.out.println(facesContext);
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
