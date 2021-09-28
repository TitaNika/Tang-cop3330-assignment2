/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex29;

import java.util.Scanner;

class assignment29 {

    public static void Return() {

        Scanner scan = new Scanner(System.in);

        boolean flag = false;

        do {
            try {

                System.out.print("What is the rate of return? ");
                int r = Integer.parseInt(scan.next());

                System.out.println("It will take " + (72 / r) + " years to double your initial investment.");

                flag = true;

            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("Sorry. That's not a valid input");
            }

        } while (!flag);

    }

    public static void main(String[] args) {

    Return();
}
}