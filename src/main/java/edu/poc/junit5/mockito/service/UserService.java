package edu.poc.junit5.mockito.service;

import edu.poc.junit5.mockito.model.User;

public interface UserService {
    User createUser(String username, String phone, int age);

    boolean createUserWithMockito(String username, String phone, int age);
}
