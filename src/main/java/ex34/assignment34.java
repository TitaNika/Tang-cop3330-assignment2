/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex34;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class assignment34 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));
        Employees(employees);

        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.println("Enter an employee name to remove: ");
        String nameToRemove = scan.nextLine();

        employees.remove(nameToRemove);

        System.out.println();
        Employees(employees);
    }

    public static void Employees(ArrayList<String> employees) {

        System.out.println("There are now "+employees.size()+" employees: ");

        for (String employee:employees)
        {
            System.out.println(employee);
        }
    }
}