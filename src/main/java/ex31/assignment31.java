/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex31;

import java.util.Scanner;

class assignment31 {

    public static void Beat() {

        Scanner scan = new Scanner(System.in);

        int age = 0;

        while (age < 1){

            System.out.print("Enter age: ");
            age = scan.nextInt();

            if (age < 1)
                System.out.println("Invalid input. \n");
        }

        int resting = 0;

        while (resting < 55 || resting > 95){

            System.out.print("Resting Pulse (55 - 95): ");
            resting = scan.nextInt();

            if (resting < 55 || resting > 95)
                System.out.println("Invalid input. \n");
        }

        System.out.println("\nIntensity |\tRate");

        for (int intensity = 55; intensity <= resting; intensity += 5){

            double rate = (((220 - age) - resting) * (intensity/100.0)) + resting;

            System.out.println(intensity + "%" + "\t\t" + (int)Math.ceil(rate) + " bpm");
        }
    }


    public static void main(String[] args){

    Beat();

    }
}