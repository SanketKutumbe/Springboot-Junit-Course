package edu.poc.junit5.mockito.service;

import edu.poc.junit5.mockito.exception.UserServiceException;
import edu.poc.junit5.mockito.model.User;
import edu.poc.junit5.mockito.repository.UserRepository;

import java.util.UUID;

public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Override
    public User createUser(String username, String phone, int age) {

        if( username == null ) throw new UserServiceException("Could not find username");

        return new User("1", username, phone, age);
    }

    @Override
    public boolean createUserWithMockito(String username, String phone, int age){
        if( username == null ) throw new UserServiceException("Could not find username");

        String id = UUID.randomUUID().toString();
        User user = new User(id, username, phone, age);
        boolean result = userRepository.save(user);

        if( !result ) throw new UserServiceException("Error executing the service");
        return result;
    }
}
