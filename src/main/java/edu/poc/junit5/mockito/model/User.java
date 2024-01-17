package edu.poc.junit5.mockito.model;

import lombok.Data;

@Data
public class User {

    private String username;
    private String phone;
    private int age;
    private String id;

    public User(String id, String username, String phone, int age) {
        this.username = username;
        this.phone = phone;
        this.age = age;
        this.id = id;
    }

}
