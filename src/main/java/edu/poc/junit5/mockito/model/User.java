package edu.poc.junit5.mockito.model;

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

    public String getUsername() {
        return this.username;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return this.id;
    }
}
