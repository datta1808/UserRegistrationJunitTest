package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest{
    UserRegistration user = new UserRegistration();
    // Test Cases for First Name
    @Test
    public void givenFirstName_whenStartsWith_capitalLetter_shouldReturn_Valid() {
        Assert.assertEquals("valid", UserRegistration.validateFirstName("Datta", user.validate));
    }

    @Test
    public void givenFirstName_whenContainsNumber_shouldReturn_Invalid() {
        Assert.assertEquals("INVALID_FIRSTNAME", UserRegistration.validateFirstName("Datta123", user.validate));
    }

    @Test
    public void givenFirstName_whenStartsWith_smallLetter_shouldReturn_Invalid() {
        Assert.assertEquals("INVALID_FIRSTNAME", UserRegistration.validateFirstName("datta", user.validate));
    }

    @Test
    public void givenFirstName_whenLength_lessThan3_shouldReturn_Invalid() {
        Assert.assertEquals("INVALID_FIRSTNAME", UserRegistration.validateFirstName("da", user.validate));
    }


    // TEST Cases for Last Name
    @Test
    public void givenLastName_whenValid_shouldReturn_Valid() {
        Assert.assertEquals("valid", UserRegistration.validateLastName("Bagale", user.validate));
    }

    @Test
    public void givenLastName_whenContainsNumber_shouldReturn_Invalid() {
        Assert.assertEquals("INVALID_LASTNAME", UserRegistration.validateLastName("Bagale123", user.validate));
    }

    @Test
    public void givenLastName_whenLength_lessThan3_shouldReturn_Invalid() {
        Assert.assertEquals("INVALID_LASTNAME", UserRegistration.validateLastName("ba", user.validate));
    }

    @Test
    public void givenLastName_whenStartsWith_smallLetter_shouldReturn_Invalid() {
        Assert.assertEquals("INVALID_LASTNAME", UserRegistration.validateLastName("datta", user.validate));
    }


    // Test cases for Email
    @Test
    public void givenEmail_whenValid_shouldReturn_Valid() {
        Assert.assertEquals("valid", UserRegistration.validateEmail("datta@gmail.com", user.validate));
    }

    @Test
    public void givenEmail_whenEmail_NotStarts_WithSmallLetter_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_EMAIL", UserRegistration.validateEmail("Bagaledatta@gmail.com", user.validate));
    }

    @Test
    public void givenEmail_whenEmail_endsWith_com_Or_in_shouldReturn_valid() {
        Assert.assertEquals("valid", UserRegistration.validateEmail("datta111@yahoo.com.in", user.validate));
    }

    @Test
    public void givenEmail_WhenEmail_notEndsWith_com_Or_In_ShouldReturn_invalid() {
        Assert.assertEquals("INVALID_EMAIL", UserRegistration.validateEmail("abc@gmail.comm", user.validate));
    }



    // Test cases for Phone Number
    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_Valid() {
        Assert.assertEquals("valid", UserRegistration.validateMobileNumber("91 7738454018", user.validate));
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotFollowedByCountryCode_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_PHONE_NUMBER", UserRegistration.validateMobileNumber("8888899999", user.validate));
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsTenDigit_Valid() {
        Assert.assertEquals("valid", UserRegistration.validateMobileNumber("91 8888899999", user.validate));
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotTenDigit_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_PHONE_NUMBER", UserRegistration.validateMobileNumber("91 7777777", user.validate));
    }


    // Test cases for Password
    @Test
    public void givenPassword_whenValid_shouldReturn_Valid() {
        Assert.assertEquals("valid", UserRegistration.validatePassword("Datta#586", user.validate));
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumber_IsFollowedBy_CountryCode_Invalid() {
        Assert.assertEquals("INVALID_PASSWORD", UserRegistration.validatePassword("datta56", user.validate));
    }

    @Test
    public void givenPassword_WhenPassword_HaveAtLeast_OneSpecialCharacter_ShouldReturn_Valid() {
        Assert.assertEquals("valid", UserRegistration.validatePassword("Datta1234$", user.validate));
    }

    @Test
    public void givenPassword_WhenPasswordHaveAtLeastOneSpecialCharacter_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_PASSWORD", UserRegistration.validatePassword("Datta1234", user.validate));
    }
}
