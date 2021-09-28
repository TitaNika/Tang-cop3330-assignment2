/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex30;

class assignment30 {

    public static void multiTable() {

        for(int i=1; i<=12 ;i++)
        {
            for(int j=1; j<=12 ;j++)
            {
                System.out.print((i*j) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        multiTable();
    }
}