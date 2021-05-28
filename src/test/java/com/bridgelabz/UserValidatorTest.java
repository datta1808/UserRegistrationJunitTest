package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
        //use case 1 test cases for first name
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
    }
