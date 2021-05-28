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
}
