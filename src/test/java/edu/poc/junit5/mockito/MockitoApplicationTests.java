package edu.poc.junit5.mockito;

import edu.poc.junit5.mockito.exception.UserServiceException;
import edu.poc.junit5.mockito.repository.UserRepository;
import edu.poc.junit5.mockito.service.UserServiceImpl;
import edu.poc.junit5.mockito.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
//@MockitoSettings(strictness = Strictness.LENIENT)
class MockitoApplicationTests {

	@InjectMocks
	UserServiceImpl userService;
	String username;
	String phone;
	int age;

	@Mock
	UserRepository userRepository;
	@BeforeEach
	public void init(){
		username = "Sanket";
		phone = "12345";
		age = 20;
	}

	@DisplayName("Test user creation")
	@Test
	public void testCreateUser_whenUserDetailsProvided_thenCreateUser_returnCreatedUserObject(){
		// Arrange
		Mockito.when(userRepository.save(Mockito.any(User.class))).thenReturn(true);

		// Act
		boolean result = userService.createUserWithMockito(username, phone, age);

		// Assert
		assertTrue(result);

		/* 	Verifying number of executions of "Save()"
			Use-case: To avoid accidentally saving the object multiple number of times.
		 */
		Mockito.verify(userRepository, Mockito.times(1)).save(Mockito.any(User.class));
	}

	@DisplayName("Create User throws exception")
	@Test
	public void testCreateUser_whenUsernameIsNull_throwUserServiceException(){
		// Arrange
		username = null;
		String expectedMessage = "Could not find username";

		// Act
		UserServiceException use = assertThrows(UserServiceException.class, ()-> userService.createUser(username, phone, age));

		// Assert
		assertEquals( use.getMessage(), expectedMessage);
	}


}
