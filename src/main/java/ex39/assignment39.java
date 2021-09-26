/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package ex39;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

class assignment39 {

    public static void main(String[] args) {

        Employee[] employees = {

                new Employee("John","Johnson","Manager",20161231),
                new Employee("Tou","Xiong","Software Engineer",20161005),
                new Employee("Michaela", "Michaelson", "District Manager", 20151219),
                new Employee("Jake","Jacobson","Programmer", 0),
                new Employee("Jacquelyn", "Jackson", "DBA", 0),
                new Employee("Sally","Webber","Web Developer",20151218)

        };

        List<Employee> list = Arrays.asList(employees);

        System.out.println("Complete Employee list:");
        list.forEach(System.out::println);

        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);

        System.out.printf(
                "%nEmployees sort by last name (y/m/d):%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);
    }

}

class Employee
{
    private final String firstName;
    private final String lastName;

    private final String position;
    private final double separationDate;

    public Employee(String firstName, String lastName,
                    String position,double separationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        this.position = position;
        this.separationDate = separationDate;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getDepartment()
    {
        return position;
    }

    public double getSeparationDate()
    {
        return separationDate;
    }

    public String toString()
    {
        return String.format("%-8s %-8s %s %8.0f",
                getFirstName(), getLastName(), getDepartment(),getSeparationDate());
    }
}