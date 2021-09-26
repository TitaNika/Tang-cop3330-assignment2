/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex37;

import java.util.Scanner;
import java.util.*;
import java.util.Random;

class assignment37 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int length = Integer.parseInt(scan.nextLine());

        System.out.print("How many special characters? ");
        int specials = Integer.parseInt(scan.nextLine());

        System.out.print("How many numbers? ");
        int numbers = Integer.parseInt(scan.nextLine());

        System.out.println("Your password is: " + Password(length, specials, numbers));
    }

    public static String Password(int length, int specials, int number)
    {

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        String specialCharacters = "`~!@#$%^&*()";

        String numbers = "1234567890";

        Random random = new Random();

        ArrayList<Character> chars = new ArrayList<>();

        for(int i = 0; i < specials; i++){

            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

        }

        for(int i = 0; i < number; i++){

            chars.add(numbers.charAt(random.nextInt(numbers.length())));

        }

        for(int i = chars.size()-1; i < length; i++){

            chars.add(letters.charAt(random.nextInt(letters.length())));

        }

        Collections.shuffle(chars);

        StringBuilder password = new StringBuilder();

        for(Character string : chars) {

            password.append(string);

        }

        return password.toString();
    }
}