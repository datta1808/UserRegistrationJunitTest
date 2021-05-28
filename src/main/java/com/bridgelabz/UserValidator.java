package com.bridgelabz;

import java.util.regex.Pattern;

public class  UserValidator {

    public boolean validateFirstName(String firstName) {
        String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
        return (Pattern.matches(NAME_PATTERN, firstName));
    }

    public boolean validateLastName(String lastName) {
        String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
        return (Pattern.matches(NAME_PATTERN, lastName));
    }

    public boolean validateEmail(String email) {
        String EMAIL = "^[a-z][a-zA-Z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z0-93]+.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$";
        return (Pattern.matches(EMAIL, email));
    }

    public boolean validatePhone(String phone) {
        String PHONE_NUMBER = "^[9][1][ ][1-9][0-9]{9}$";
        return (Pattern.matches(PHONE_NUMBER, phone));
    }

    public boolean validatePassword(String password) {
        String PASSWORD_PATTERN = "(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,}";
        return (Pattern.matches(PASSWORD_PATTERN, password));
    }
}
