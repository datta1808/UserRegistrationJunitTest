package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

    UserValidator userValidator = new UserValidator();

    //when a name starts with a capital letter
    @Test
    public void givenFirstName_ShouldReturn_True() {
        boolean result = userValidator.validateFirstName("Datta");
        Assert.assertTrue(result);
    }

    //when a name starts with a small letter
    @Test
    public void givenFirstName_ShouldReturn_False() {
        boolean result = userValidator.validateFirstName("datta");
        Assert.assertFalse(result);
    }


    @Test
    //when a name does not contain 3 minimum letters
    public void givenFirstName_NotHaveMinimumThreeLetters_ShouldReturn_False() {
        boolean result = userValidator.validateFirstName("Da");
        Assert.assertFalse(result);
    }


    // TEST CASES FOR LAST NAME
    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True() {
        boolean result = userValidator.validateLastName("Bagale");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenLastNameNotStartsWithCapitalLetter_ShouldReturn_False() {
        boolean result = userValidator.validateLastName("bagale");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenLastNameNotHaveMinimumThreeLetter_ShouldReturn_False() {
        boolean result = userValidator.validateLastName("ba");
        Assert.assertFalse(result);
    }


    // TEST CASES FOR EMAIL
    @Test
    public void givenEmail_WhenEmailStartsWithSmallLetter_ShouldReturn_True() {
        boolean result = userValidator.validateEmail("bagaledatta18@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenEmailNotStartsWithSmallLetter_ShouldReturn_False() {
        boolean result = userValidator.validateEmail("Bagaledatta@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenEmailEndsWithComOrIn_ShouldReturn_True() {
        boolean result = userValidator.validateEmail("datta111@yahoo.com.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenEmailNotEndsWithComOrIn_ShouldReturn_False() {
        boolean result = userValidator.validateEmail("abc@gmail.comm");
        Assert.assertFalse(result);
    }


    //TEST CASES FOR PHONE NUMBER
    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_True() {
        boolean result = userValidator.validatePhone("91 9999988888");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotFollowedByCountryCode_ShouldReturn_False() {
        boolean result = userValidator.validatePhone("8888899999");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsTenDigit_True() {
        boolean result = userValidator.validatePhone("91 8888899999");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotTenDigit_ShouldReturn_False() {
        boolean result = userValidator.validatePhone("91 7777777");
        Assert.assertFalse(result);
    }

    // PASSWORD VALIDATION

    // Password must contain minimum 8 characters
    @Test
    public void givenPassword_WhenPasswordIsMinimumEightDigit_ShouldReturn_True() {
        boolean result = userValidator.validatePassword("Bagale$9718");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenPasswordIsNotMinimumEightDigit_ShouldReturn_False() {
        boolean result = userValidator.validatePassword("datta");
        Assert.assertFalse(result);
    }

    // Password must contain At least 1 uppercase letter
    @Test
    public void givenPassword_WhenPasswordHaveAtLeastOneUppercaseLetter_ShouldReturn_True() {
        boolean result = userValidator.validatePassword("Datta$0987");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenPasswordNotHaveAtLeastOneUppercaseLetter_ShouldReturn_False() {
        boolean result = userValidator.validatePassword("datta$0987@");
        Assert.assertFalse(result);
    }

    // Password must contain At Least 1 numeric number
    @Test
    public void givenPassword_WhenPasswordHaveAtLeastOneNumericNumber_ShouldReturn_True() {
        boolean result = userValidator.validatePassword("Bagale$890");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenPasswordNotHaveAtLeastOneNumericNumber_ShouldReturn_False() {
        boolean result = userValidator.validatePassword("bagale@");
        Assert.assertFalse(result);
    }

    // Password must contain at least 1 special character
    @Test
    public void givenPassword_WhenPasswordHaveAtLeastOneSpecialCharacter_ShouldReturn_True() {
        boolean result = userValidator.validatePassword("Datta1234$");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenPasswordNotHaveAtLeastOneSpecialCharacter_ShouldReturn_False() {
        boolean result = userValidator.validatePassword("Datta1234");
        Assert.assertFalse(result);
    }
}