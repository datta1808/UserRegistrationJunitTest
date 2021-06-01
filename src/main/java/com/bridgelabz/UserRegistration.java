package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class UserRegistration {

    // INPUT Validation
    public static boolean validateInput(String input, UserFieldPattern regex ) {
        boolean result;
        Pattern pattern = Pattern.compile(regex.pattern);
        Matcher matcher = pattern.matcher(input);
        result = matcher.find(); // true or false
        return result;
    }

    // First Name validation
    public static String validateFirstName(String firstName) {
        String result;
        try {
            if(validateInput(firstName, UserFieldPattern.REGEX_NAME)) {
                result = "valid";
            }
            else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_FIRSTNAME, "Invalid User Details");
            }
        } catch(InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }


    // Last Name validation
    public static String validateLastName(String lastName) {
        String result;
        try {
            if(validateInput(lastName, UserFieldPattern.REGEX_NAME)) {
                result = "valid";
            } else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_LASTNAME, "Invalid User Details");
            }
        } catch(InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }


    // Email Validation
    public static String validateEmail(String email) {
        String result;
        try {
            if(validateInput(email, UserFieldPattern.REGEX_EMAIL )) {
                result = "valid";
            } else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_EMAIL, "Invalid User Details");
            }
        } catch(InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }


    // Mobile Number validation
    public static String validateMobileNumber(String number) {
        String result;
        try {
            if(validateInput(number, UserFieldPattern.REGEX_MOBILE_NUMBER)) {
                result = "valid";
            } else
            {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_PHONE_NUMBER, "Invalid User Details");
            }
        } catch(InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }


    // Password Validation
    public static String validatePassword(String password) {
        String result;
        try {
            if(validateInput(password, UserFieldPattern.REGEX_PASSWORD)) {
                result = "valid";
            } else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_PASSWORD, "Invalid User Details");
            }
        } catch(InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }
}