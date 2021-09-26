/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex27;
import java.util.regex.Pattern;
import java.util.Scanner;

class assignment27 {

    static String database = "";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first name: \n");
        String firstName = scan.nextLine();

        System.out.print("Enter the last name: \n");
        String lastName = scan.nextLine();

        System.out.print("Enter the ZIP code: \n");
        String zip = scan.nextLine();

        System.out.print("Enter the employee ID: \n");
        String employeeID = scan.nextLine();

        validateInput(firstName, lastName, zip, employeeID);

    }

    public static void validateInput(String firstName, String lastName, String zip, String employeeID) {

        boolean first = checkFirstName(firstName),
                last = checkLastName(lastName),
                id = checkID(employeeID),
                zipcode = checkZipCode(zip);

        if (first && last && zipcode && id) {

            database = "There were no errors found.";

        }

        System.out.println(database);

    }

    public static boolean checkFirstName(String firstName) {

        boolean status = true;

        if (firstName.length() < 2) {

            database = database + "The first name must be at least 2 characters long.\n";
            status = false;

        }
        if (firstName.length() == 0) {

            database = database + "The first name must be filled in.\n";

        }

        return status;

    }


    public static boolean checkLastName(String lastName) {

        boolean status = true;

        if (lastName.length() < 2) {

            database = database + "The last name must be at least 2 characters long.\n";
            status = false;

        }
        if (lastName.length() == 0) {

            System.out.println("The last name must be filled in.");

        }

        return status;

    }

    public static boolean checkZipCode(String zip) {

        boolean status = true;

        try {

            if (zip.length() != 5) {
                database = database + "The zipcode must be a 5 digit number.\n";
                status = false;
            }

        }

        catch (Exception e) {

            database = database + "The zipcode must be a 5 digit number.\n";
            status = false;

        }

        return status;

    }

    public static boolean checkID(String employeeID) {

        String pattern = "[a-zA-Z]{2}[-][0-9]{4}";

        if (!Pattern.matches(pattern, employeeID)) {

            database = database + "The employee ID must be in the format of AA-1234.\n";
            return false;

        }

        return true;
    }

}