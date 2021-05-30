package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
    static final String regexName = "^[A-Z][a-zA-z]{2,}";
    static final String regexEmail = "^[a-z][a-zA-Z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z0-93]+.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?";
    static final String regexMobileNumber = "^[9][1][ ][1-9][0-9]{9}$";
    static final String regexPassword = "(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,}";

    public static boolean validateInput(String input, String regex) {
        boolean result;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        result = matcher.find(); // true or false
        return result;
    }

    public static String validateFirstName(String firstName) {
        String result;
        try {
            if(validateInput(firstName, regexName)) {
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

    public static String validateLastName(String lastName) {
        String result;
        try {
            if(validateInput(lastName, regexName)) {
                result = "valid";
            } else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_LASTNAME, "Invalid User Details");
            }
        } catch(InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }

    public static String validateEmail(String email) {
        String result;
        try {
            if(validateInput(email, regexEmail)) {
                result = "valid";
            } else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_EMAIL, "Invalid User Details");
            }
        } catch(InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }

    public static String validateMobileNumber(String number) {
        String result;
        try {
            if(validateInput(number, regexMobileNumber)) {
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

    public static String validatePassword(String password) {
        String result;
        try {
            if(validateInput(password, regexPassword)) {
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