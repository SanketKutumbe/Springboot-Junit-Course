package edu.poc.junit5.tdd.service;

import edu.poc.junit5.tdd.model.User;

public interface UserService {
    User createUser(String username, String phone, int age);
}
