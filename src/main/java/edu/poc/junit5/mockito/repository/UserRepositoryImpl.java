package edu.poc.junit5.mockito.repository;

import edu.poc.junit5.mockito.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    Map<String, User> map = new HashMap<>();
    @Override
    public boolean save(User user) {
        boolean result = false;

        if( !map.containsKey(user.getId()) ){

            map.put(user.getId(), user);
            result = true;
        }
        return result;
    }

    @Override
    public void status(User user) {
        System.out.println("Checking the status but returning anything");
    }


}
