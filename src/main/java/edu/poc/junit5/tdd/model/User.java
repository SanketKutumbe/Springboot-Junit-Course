package edu.poc.junit5.tdd.model;

public class User {

    private String username;
    private String phone;
    private int age;

    public User(String username, String phone, int age) {
        this.username = username;
        this.phone = phone;
        this.age = age;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

}
