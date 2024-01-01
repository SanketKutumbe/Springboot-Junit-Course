package edu.poc.junit5.mockito.repository;

import edu.poc.junit5.mockito.model.User;

public interface UserRepository {

    boolean save(User user);
    void status(User user);
}
