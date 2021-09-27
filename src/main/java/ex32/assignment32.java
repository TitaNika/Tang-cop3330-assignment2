/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex32;

import java.util.Scanner;

class assignment32 {

    public static void main(String[] args) {

        System.out.println("--Let's play Guess the Number!--");

        int secretNum;

        Scanner scan = new Scanner(System.in);

        int guess, total, answer;

        while(true){

            total=0;

            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            answer = scan.nextInt();

            if (answer == 1)
                secretNum = (int) (Math.random() * 10 + 1);
            else if (answer == 2)
                secretNum = (int) (Math.random() * 100 + 1);
            else
                secretNum = (int) (Math.random() * 1000 + 1);

            System.out.print("I have my number. What's your guess?: ");
            do {

                guess = scan.nextInt();
                total++;

                if (guess == secretNum) {
                    System.out.println("You got it in " + total + " guesses!");
                } else if (guess < secretNum)

                    System.out.println("Too low. Guess again: ");

                else System.out.println("Too high. Guess again: ");

                if (guess != secretNum) {
                    System.out.println("WRONG!");
                }



            } while (guess != secretNum);

            System.out.print("\nDo you wish to play again (Y/N)?  ");

            char x = scan.next().charAt(0);

            if(x == 'N' || x== 'n')

                System.out.println("Awwww, that's too bad! See ya next time!");
                break;
        }

    }
}
