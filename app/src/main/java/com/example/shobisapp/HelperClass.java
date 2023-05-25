package com.example.shobisapp;

public class HelperClass {

    String name, email, password, confirm_password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }

    public HelperClass(String name, String email, String password, String confirm_password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirm_password = confirm_password;
    }

    public HelperClass() {
    }
}
