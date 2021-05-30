package com.bridgelabz;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        String test;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name");
        test = input.nextLine();
        System.out.println(UserRegistration.validateFirstName(test));

        System.out.println("Enter the last name");
        test = input.nextLine();
        System.out.println(UserRegistration.validateLastName(test));

        System.out.println("Enter the Email");
        test=input.nextLine();
        System.out.println(UserRegistration.validateEmail(test));

        System.out.println("Enter the Mobile Number");
        test = input.nextLine();
        System.out.println(UserRegistration.validateMobileNumber(test));

        System.out.println("Enter the Password");
        test = input.nextLine();
        System.out.println(UserRegistration.validatePassword(test));
    }
}
