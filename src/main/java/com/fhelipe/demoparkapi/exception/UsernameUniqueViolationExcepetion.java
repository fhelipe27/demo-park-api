package com.fhelipe.demoparkapi.exception;

public class UsernameUniqueViolationExcepetion extends RuntimeException {
    public UsernameUniqueViolationExcepetion(String message) {
        super(message);
    }
}
