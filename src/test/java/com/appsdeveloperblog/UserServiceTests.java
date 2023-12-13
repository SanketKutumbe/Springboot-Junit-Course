package com.appsdeveloperblog;

import com.appsdeveloperblog.io.UsersDatabase;
import com.appsdeveloperblog.io.UsersDatabaseMapImpl;
import com.appsdeveloperblog.service.UserService;
import com.appsdeveloperblog.service.UserServiceImpl;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserServiceTests {

    UsersDatabase usersDatabase;
    UserService userService;

    String userId;

    @BeforeAll
    void initialse(){
        usersDatabase = new UsersDatabaseMapImpl();
        usersDatabase.init();
        userService = new UserServiceImpl(usersDatabase);
    }

    //create
    @Test
    @Order(1)
    @DisplayName("Creating user in database")
    public void testCreateUser_whenFirstAndLastNameProvided_returnUserId(){
        // Arrange
        Map userMap = new HashMap();
        userMap.put("FirstName", "Sanket");
        userMap.put("LastName", "Kutumbe");

        // Act
        userId = userService.createUser(userMap);

        // Assert
        assertNotNull(userId, () -> "User ID not found");

    }

    //update

    @Test
    @Order(2)
    @DisplayName("Updating user in database")
    public void testUpdateUser_whenFirstNameAndLastNameProvided(){

        // Arrange
        Map updatedUserDetails = new HashMap();
        updatedUserDetails.put("FirstName","Suyash");
        updatedUserDetails.put("LastName","Kulkarni");

        // Act
        Map resultMap = userService.updateUser(userId, updatedUserDetails);

        System.out.println( userService.getUserDetails(userId) );

        // Assert
        assertEquals( updatedUserDetails.get("FirstName"), resultMap.get("FirstName") );
        assertEquals( updatedUserDetails.get("LastName"), resultMap.get("LastName") );
    }

    //get

    @Test
    @Order(3)
    void testGetUserDetailsMap_whenUserIDisProvided_returnMapNotNull(){
        // Arrange

        // Act
        Map resultMap = userService.getUserDetails(userId);

        // Assert
        assertNotNull(resultMap, "Existing map should not be null for given UserID");
    }

    //delete
    @Test
    @Order(4)
    void testDeleteUserDetails_whenUserIdisProvided(){
        // Arrange

        // Act
        userService.deleteUser(userId);

        // Assert
        assertNull(userService.getUserDetails(userId));


    }

}
