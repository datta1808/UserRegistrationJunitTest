package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest{

    // Test Cases for First Name
    @Test
    public void givenFirstName_whenStartsWith_capitalLetter_shouldReturn_Valid() {
        Assert.assertEquals("valid", UserRegistration.validateFirstName("Datta"));
    }

    @Test
    public void givenFirstName_whenContainsNumber_shouldReturn_Invalid() {
        Assert.assertEquals("INVALID_FIRSTNAME", UserRegistration.validateFirstName("Datta123"));
    }

    @Test
    public void givenFirstName_whenStartsWith_smallLetter_shouldReturn_Invalid() {
        Assert.assertEquals("INVALID_FIRSTNAME", UserRegistration.validateFirstName("datta"));
    }

    @Test
    public void givenFirstName_whenLength_lessThan3_shouldReturn_Invalid() {
        Assert.assertEquals("INVALID_FIRSTNAME", UserRegistration.validateFirstName("da"));
    }


    // TEST Cases for Last Name
    @Test
    public void givenLastName_whenValid_shouldReturn_Valid() {
        Assert.assertEquals("valid", UserRegistration.validateLastName("Bagale"));
    }

    @Test
    public void givenLastName_whenContainsNumber_shouldReturn_Invalid() {
        Assert.assertEquals("INVALID_LASTNAME", UserRegistration.validateLastName("Bagale123"));
    }

    @Test
    public void givenLastName_whenLength_lessThan3_shouldReturn_Invalid() {
        Assert.assertEquals("INVALID_LASTNAME", UserRegistration.validateLastName("ba"));
    }

    @Test
    public void givenLastName_whenStartsWith_smallLetter_shouldReturn_Invalid() {
        Assert.assertEquals("INVALID_LASTNAME", UserRegistration.validateLastName("datta"));
    }


    // Test cases for Email
    @Test
    public void givenEmail_whenValid_shouldReturn_Valid() {
        Assert.assertEquals("valid", UserRegistration.validateEmail("datta@gmail.com"));
    }

    @Test
    public void givenEmail_WhenEmailNotStartsWithSmallLetter_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_EMAIL", UserRegistration.validateEmail("Bagaledatta@gmail.com"));
    }

    @Test
    public void givenEmail_WhenEmailEndsWithComOrIn_ShouldReturn_Valid() {
        Assert.assertEquals("valid", UserRegistration.validateEmail("datta111@yahoo.com.in"));
    }

    @Test
    public void givenEmail_WhenEmailNotEndsWithComOrIn_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_EMAIL", UserRegistration.validateEmail("abc@gmail.comm"));
    }



    // Test cases for Phone Number
    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_Valid() {
        Assert.assertEquals("valid", UserRegistration.validateMobileNumber("91 7738454018"));
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotFollowedByCountryCode_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_PHONE_NUMBER", UserRegistration.validateMobileNumber("8888899999"));
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsTenDigit_Valid() {
        Assert.assertEquals("valid", UserRegistration.validateMobileNumber("91 8888899999"));
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotTenDigit_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_PHONE_NUMBER", UserRegistration.validateMobileNumber("91 7777777"));
    }


    // Test cases for Password
    @Test
    public void givenPassword_whenValid_shouldReturn_Valid() {
        Assert.assertEquals("valid", UserRegistration.validatePassword("Datta#586"));
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_Invalid() {
        Assert.assertEquals("INVALID_PASSWORD", UserRegistration.validatePassword("datta56"));
    }

    @Test
    public void givenPassword_WhenPasswordHaveAtLeastOneSpecialCharacter_ShouldReturn_Valid() {
        Assert.assertEquals("valid", UserRegistration.validatePassword("Datta1234$"));
    }

    @Test
    public void givenPassword_WhenPasswordHaveAtLeastOneSpecialCharacter_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_PASSWORD", UserRegistration.validatePassword("Datta1234"));
    }
}
