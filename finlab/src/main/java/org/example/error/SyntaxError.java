package org.example.error;

public class SyntaxError extends RuntimeException {
    public SyntaxError(String message) {
        super(message);
    }
}
