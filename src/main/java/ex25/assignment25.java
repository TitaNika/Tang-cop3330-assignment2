/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex25;
import java.util.Scanner;
import java.util.*;

class assignment25 {

    public static void passwordValidator(String input)
    {
        int length = input.length();

        boolean Lower = false;
        boolean Upper = false;
        boolean Digit = false;
        boolean Special = false;

        Set<Character> set = new HashSet<>(

                Arrays.asList('`', '~', '!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));

        for (char i : input.toCharArray())
        {

            if (Character.isLowerCase(i))
                Lower = true;
            if (Character.isUpperCase(i))
                Upper = true;
            if (Character.isDigit(i))
                Digit = true;
            if (set.contains(i))
                Special = true;

        }

        if (Digit && (Lower || Upper) && Special && (length >= 8))
            System.out.println("Is a Very Strong Password.");

        else if ((Lower || Upper) && Digit && (length >= 8))
            System.out.println("Is a Strong Password.");

        else if (Lower || Upper)
            System.out.print("Is a Weak Password.");

        else
            System.out.print("Is a Very Weak Password.");

    }

    public static void main(String[] args)

    {

        String input;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Password: ");
        input = scan.nextLine();

        passwordValidator(input);

    }

}