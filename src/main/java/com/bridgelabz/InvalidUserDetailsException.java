package com.bridgelabz;

public class InvalidUserDetailsException extends Exception {
    enum invalidCredentials{
        INVALID_FIRSTNAME, INVALID_LASTNAME, INVALID_EMAIL, INVALID_PHONE_NUMBER, INVALID_PASSWORD
    }

    public invalidCredentials type;

    public InvalidUserDetailsException(invalidCredentials type, String message) {
        super(message);
        this.type = type;
    }
}

