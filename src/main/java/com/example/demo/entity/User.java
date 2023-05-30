package com.example.demo.entity;

public class User {
    private String passWord;
    private String userName;
    private String gender;
    private String address;
    private String email;
    private String phone;
    private long id;

    public User(long id, String userName, String passWord, String gender, String address, String email, String phone) {
        this.passWord = passWord;
        this.userName = userName;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
