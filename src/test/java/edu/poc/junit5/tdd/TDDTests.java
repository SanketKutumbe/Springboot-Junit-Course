package edu.poc.junit5.tdd;

import edu.poc.junit5.tdd.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TDDTests {

    UserService userService;
    String username;
    String phone;
    int age;

    @BeforeEach
    public void init(){
        userService = new UserServiceImpl();
        username = "Sanket";
        phone = "12345";
        age = 20;
    }

    @DisplayName("Test user creation")
    @Test
    public void testCreateUser_whenUserDetailsProvided_thenCreateUser_returnCreatedUserObject(){
        // Arrange


        // Act
        User resultUser = userService.createUser(username, phone, age);

        // Assert
        assertNotNull(resultUser);
        assertEquals(username, resultUser.getUsername());
        assertEquals(phone, resultUser.getPhone());

    }
}
