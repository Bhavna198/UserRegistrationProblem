package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String firstName = sc.next();
        is_valid_First_Name(firstName);

        System.out.println("Enter the Last Name");
        String lastName = sc.next();
        is_valid_Last_Name(lastName);

    }

       //Use Case 2
    public static void is_valid_First_Name(String firstName) {
        boolean firstNamevalid;
        String regex = "^[A-Z][a-z]+$";
        Pattern p = Pattern.compile(regex);
        if (firstName == null) {
            firstNamevalid = false;
        }
        Matcher m = p.matcher(firstName);
        firstNamevalid = m.matches();

        if (firstNamevalid)
            System.out.println(firstName + " Vaild First Name");
        else
            System.out.println(firstName + " Invalid First Name");
    }

    /**
     * Use Case 2
     * (^ symbol used for validating start char starts from A [A-Z])
     *
     * @param lastName
     */

    public static void is_valid_Last_Name(String lastName) {
        boolean lastNamevalid;
        String regex = "^[A-Z][a-z]+$";
        Pattern p = Pattern.compile(regex);
        if (lastName == null) {
            lastNamevalid = false;
        }
        Matcher m = p.matcher(lastName);
        lastNamevalid = m.matches();

        if (lastNamevalid)
            System.out.println(lastName + " Vaild Last Name");
        else
            System.out.println(lastName + " Invalid Last Name");
    }
}

