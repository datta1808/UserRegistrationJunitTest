package com.bridgelabz;

import java.util.regex.Pattern;

public class  UserValidator {

    public boolean validateFirstName(String firstName) {
        String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
        return (Pattern.matches(NAME_PATTERN, firstName));
    }
}
