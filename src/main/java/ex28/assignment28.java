/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex28;

import java.util.Scanner;

class assignment28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        {
            int i, num, sum = 0;

            double total;

            for (i = 0; i < 5; i++) {

                System.out.println("Enter a number : ");
                num = scan.nextInt();

                sum += num;
            }

            total = sum;
            System.out.println("The total is " + total);
        }
    }
}