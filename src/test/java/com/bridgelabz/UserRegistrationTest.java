package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest{
    @Test
    public void givenFirstName_valid_should_Return_Valid() {
        Assert.assertEquals("valid", UserRegistration.validateFirstName("Datta"));
    }

    @Test
    public void givenFirstName_Invalid_shouldReturnInvalid() {
        Assert.assertEquals("INVALID_FIRSTNAME", UserRegistration.validateFirstName("datta"));
    }

    @Test
    public void givenLastName_Valid_shouldReturnValid() {
        Assert.assertEquals("valid", UserRegistration.validateLastName("Bagale"));
    }

    @Test
    public void givenLastName_Invalid_shouldReturnInvalid() {
        Assert.assertEquals("INVALID_LASTNAME", UserRegistration.validateLastName("ba"));
    }

    @Test
    public void givenEmail_Valid_shouldReturnValid() {
        Assert.assertEquals("valid", UserRegistration.validateEmail("datta@gmail.com"));
    }

    @Test
    public void givenEmail_Invalid_shouldReturnInvalid() {
        Assert.assertEquals("INVALID_EMAIL", UserRegistration.validateEmail("Datta@gmail.comm"));
    }

    @Test
    public void givenMobileNumber_Valid_shouldReturnValid() {
        Assert.assertEquals("valid", UserRegistration.validateMobileNumber("91 7738454018"));
    }

    @Test
    public void givenMobileNumber_Invalid_shouldReturnInvalid() {
        Assert.assertEquals("INVALID_PHONE_NUMBER", UserRegistration.validateMobileNumber("91 7654"));
    }

    @Test
    public void givenPassword_Valid_shouldReturnValid() {
        Assert.assertEquals("valid", UserRegistration.validatePassword("Datta#586"));
    }

    @Test
    public void givenPassword_Invalid_shouldReturnInvalid() {
        Assert.assertEquals("INVALID_PASSWORD", UserRegistration.validatePassword("datta56"));
    }
}
