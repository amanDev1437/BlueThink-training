package com.aman.learnjsp;

public class Login {

    private String name;
    private String password;

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public boolean validate(){
        if(password.equals("admin")){
            return true;
        }else{
            return false;
        }
    }
}
