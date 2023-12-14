package edu.poc.junit5.tdd.service;

import edu.poc.junit5.tdd.model.User;

public class UserServiceImpl implements UserService {
    @Override
    public User createUser(String username, String phone, int age) {

        return new User(username);
    }
}
