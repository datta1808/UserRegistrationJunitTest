package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

        UserValidator userValidator = new UserValidator();

        //when the name starts with a capital letter
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
    }

