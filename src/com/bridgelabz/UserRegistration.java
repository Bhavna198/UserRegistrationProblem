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

        System.out.println("Enter the Mail Id");
        String emailId = sc.next();
        is_valid_EmailId(emailId);

        System.out.println("Enter the Mobile Number");
        String mobilenumber = sc.next();
        Is_Valid_MobileNumber(mobilenumber);

        System.out.println("Enter the password");
        String password = sc.next();
        Is_Valid_Password(password);

        System.out.println("Enter the password");
        String pass = sc.next();
        is_Valid_PasswordRule2(pass);

        System.out.println("Enter the password");
        String passw = sc.next();
        is_Valid_PasswordRule3(passw);


    }


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
            System.out.println(firstName + " Valid First Name");
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
            System.out.println(lastName + " Valid Last Name");
        else
            System.out.println(lastName + " Invalid Last Name");
    }

    /**
     * Use Case 3
     * As a User need to enter a valid email.
     * - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
     * & co) and 2 optional (xyz & in) with
     * precise @ and . positions
     */
    public static void is_valid_EmailId(String emailId) {
        boolean validEmailId;
        String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";

        Pattern p = Pattern.compile(emailRegex);
        if (emailId == null)
            validEmailId = false;

        Matcher m = p.matcher(emailId);
        validEmailId = m.matches();

        if (validEmailId)
            System.out.println(emailId + " Valid EmailId");
        else
            System.out.println(emailId + " Invalid EmailId");
    }

    /**
     * Use Case 4
     *
     * @param mobileNumber
     */
    public static void Is_Valid_MobileNumber(String mobileNumber) {

        boolean mobileNumberValid;
        Pattern p = Pattern.compile("^[0-9]{2}\\s{1}[0-9]{10}$");
        if (mobileNumber == null) {
            mobileNumberValid = false;
        }
        Matcher matcherObject = p.matcher(mobileNumber);
        mobileNumberValid = matcherObject.matches();

        if (mobileNumberValid)
            System.out.println(mobileNumber + " Valid  Mobile Number \n");
        else
            System.out.println(mobileNumber + " Invalid Mobile Number");
    }

    /**
     * Use Case 5
     * As a User need to
     * follow predefined
     * Password rules.
     */
    public static void Is_Valid_Password(String password) {
        boolean passwordValid;
        String passRegex = "^[a-zA-Z0-9]*.{8,}$";
        Pattern p = Pattern.compile(passRegex);
        if (passRegex == null) {
            passwordValid = false;
        }
        Matcher m = p.matcher(password);
        passwordValid = m.matches();

        if (passwordValid)
            System.out.println(password + " Valid  Password");
        else
            System.out.println(password + " Invalid Password");
    }

    /**
     * Use Case 6
     */
    public static void is_Valid_PasswordRule2(String pass) {
        boolean passwordValid;
        String passRegex = "^(?=.*[A-Z]$)";
        Pattern p = Pattern.compile(passRegex);
        if (passRegex == null) {
            passwordValid = false;
        }
        Matcher m = p.matcher(pass);
        passwordValid = m.matches();

        if (passwordValid)
            System.out.println(pass + " Valid  Password");
        else
            System.out.println(pass + " Invalid Password");
    }
    //Use case 7

    public static void is_Valid_PasswordRule3(String passw) {
        boolean passwordValid;
        String passRegex = "^(?=.*[0-9]$)";
        Pattern p = Pattern.compile(passRegex);
        if (passRegex == null) {
            passwordValid = false;
        }
        Matcher m = p.matcher(passw);
        passwordValid = m.matches();

        if (passwordValid)
            System.out.println(passw + " Valid  Password");
        else
            System.out.println(passw + " Invalid Password");
    }
}

