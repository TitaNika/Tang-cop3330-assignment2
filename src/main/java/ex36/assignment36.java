/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex36;

import java.util.ArrayList;
import java.util.Scanner;

class assignment36 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList <Integer> numbers = new ArrayList<>();
        String numentry;

        do {

            System.out.println("Enter a number: ");
            numentry = scan.next();

            if (!numentry.equals("done")) {
                try {

                    int num = Integer.parseInt(numentry);
                    numbers.add(num);

                }catch(NumberFormatException ignored) {}
            }

        }

        while (!numentry.equals("done"));

        System.out.println("Numbers: " + numbers);

        System.out.println("The average is " + average(numbers));

        System.out.println("The minimum is " + min(numbers));

        System.out.println("The maximum is " + max(numbers));

        System.out.println("The standard deviation is " + String.format("%.2f", std(numbers)));


    }

    public static double average (ArrayList<Integer> numbers) {

        int total = 0;

        for (int num: numbers) {

            total += num;

        }

        return (double)(total)/numbers.size();

    }

    public static int max (ArrayList<Integer> numbers) {

        int max= numbers.get(0);

        for (int num: numbers) {

            if(num > max)
                max = num;
        }

        return max;
    }

    public static int min (ArrayList<Integer> numbers) {

        int min= numbers.get(0);

        for (int num: numbers) {

            if(num < min)
                min = num;

        }

        return min;
    }

    public static double std (ArrayList<Integer> numbers) {

        double mean = average(numbers);

        double sum = 0;

        for (int num: numbers) {

            sum = sum + Math.pow((num-mean), 2);

        }

        return Math.sqrt(sum/numbers.size());
    }
}