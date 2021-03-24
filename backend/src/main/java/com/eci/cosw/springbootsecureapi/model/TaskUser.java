package com.eci.cosw.springbootsecureapi.model;

public class TaskUser {

    private String name;
    private String email;

    public TaskUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public TaskUser(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
