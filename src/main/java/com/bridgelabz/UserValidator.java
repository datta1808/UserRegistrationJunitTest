package com.bridgelabz;

public class UserValidator {

    public boolean validateFirstName(String firstName) {
        boolean validation = firstName.matches("^[A-Z][a-z]{2,}$");
        if(validation) {
            System.out.println("First Name is Valid");
        } else {
            System.out.println("Invalid. \n Enter a valid name");
        }
        return validation;
    }

    public boolean validateLastName (String lastName){
        boolean validation = lastName.matches("^[A-Z][a-z]{2,}$");
        if(validation) {
            System.out.println("Last Name is Valid");
        } else {
            System.out.println("Invalid. \n Enter a valid Name");
        }
        return validation;
    }

    public boolean validateEmail (String email){
        boolean validation = email.matches("^[a-z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z0-93]+.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$");
        if(validation) {
            System.out.println("Email is Valid");
        } else {
            System.out.println("Invalid. \n Enter a valid Email");
        }
        return validation;
    }

    public boolean validatePhone (String mobile){
        boolean validation = mobile.matches("^[9][1][ ][0-9]{10}$");
        if(validation) {
            System.out.println("Mobile number is Valid");
        } else {
            System.out.println("Invalid. \n Enter a valid mobile number");
        }
        return validation;
    }

    public boolean validatePassword (String password){
        boolean validation = password.matches("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,}");
        if(validation) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Invalid. \n Enter a valid Password");
        }
        return validation;
    }
}