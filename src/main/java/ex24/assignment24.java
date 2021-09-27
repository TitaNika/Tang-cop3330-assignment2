/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex24;
import java.util.Scanner;
import java.util.*;

class assignment24 {

    static boolean Anagram (String str1, String str2) {

        boolean status;

        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");

        if (s1.length() != s2.length()) {

            status = false;

        }
        else
        {
            char[] AS1 = s1.toLowerCase().toCharArray();
            char[] AS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(AS1);
            Arrays.sort(AS2);

            status = Arrays.equals(AS1, AS2);
        }

        return status;
    }

    public static void main(String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.print("Enter the first string: ");
        String string1 = scan.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scan.nextLine();

        if (Anagram(string1,string2))

            System.out.println(string1 + " and " + string2 + " are anagrams.");

        else
            System.out.println(string2 + " and " + string2 + " are not anagrams.");

    }
}
