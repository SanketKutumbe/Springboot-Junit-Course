package edu.poc.junit5.tdd.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserServiceTests {

    @DisplayName("Test user creation")
    @Test
    public void testCreateUser_whenUserDetailsProvided_thenCreateUser_returnCreatedUserObject(){
        // Arrange
        UserService userService = new UserServiceImpl();

        // Act

        // Assert
    }
}
