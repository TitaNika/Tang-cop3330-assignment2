/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex38;

import java.util.Scanner;
import java.util.*;

class assignment38 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = scan.nextLine();

        String[] list = data.split(" ");

        Integer[] even = filterEvenNumbers(list);

        System.out.print("The even numbers are ");

        for(int i=0; i<even.length; i++)
        {
            if(i < even.length-1){

                System.out.print(even[i] + " ");

            }
            else
            {

                System.out.print(even[i] + ".");

            }
        }
    }

    public static Integer[] filterEvenNumbers(String[] list) {

        ArrayList<Integer> even = new ArrayList<>();

        for (String string : list) {

            int num = Integer.parseInt(string);

            if (num % 2 == 0) {

                even.add(num);
            }
        }

        Integer[] arr = new Integer[even.size()];

        arr = even.toArray(arr);

        return arr;
    }
}