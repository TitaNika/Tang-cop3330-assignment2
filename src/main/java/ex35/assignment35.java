/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class assignment35 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        ArrayList<String> nameList = new ArrayList<>();

        do {
            System.out.println("Enter a name (Press Enter 2x when inputted all names):");
            name= input.nextLine();

            if(!name.isEmpty())
                nameList.add(name);
        } while(!name.isEmpty());

        Random random = new Random();
        int randomWinner = random.nextInt(nameList.size());

        System.out.println("The winner is... " + nameList.get(randomWinner) + "!");
    }

}

