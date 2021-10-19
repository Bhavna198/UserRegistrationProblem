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
            System.out.println(firstName + " Vaild First Name");
        else
            System.out.println(firstName + " Invalid First Name");
    }


}

