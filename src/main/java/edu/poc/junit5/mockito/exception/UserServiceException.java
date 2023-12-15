package edu.poc.junit5.mockito.exception;

public class UserServiceException extends RuntimeException {

    public UserServiceException(String msg){
        super(msg);
    }
}
