/* Lab #5
 * A Simple Inheritance Hierarchy
 * CSC123 Lab
 * TEST CLASS DO NOT EDIT!
 *
 */

import java.util.*;
import java.io.*;

public class TestEmployee {
    public static void main(String[] args) {
        Employee matt = new Employee();
        
        /* Set matt's attributes. */
        matt.setName("Matt Levan");
        matt.setID(1337);
        matt.setAge(27);
        matt.setSalary(1000000);
        matt.setTitle("Lab Instructor");
        matt.setDepartment("Computer Science");

        /* Test methods. */
        matt.printRecord();
        matt.changeSalary(0.5);
        System.out.println(matt.getSalary());

        /* Constructor argument determines the size of the Employee array. */
        Manager garrett = new Manager(1);
        
        /* Set garrett's attributes. */
        garrett.setName("Garrett Poppe");
        garrett.setID(1337);
        garrett.setAge(27);
        garrett.setSalary(1000000);
        garrett.setTitle("Instructor");
        garrett.setDepartment("Computer Science");
        garrett.addEmployee(matt);

        /* Test methods. */
        garrett.printRecord(); // Should print Garret's and Matt's records.
        garrett.changeSalary(0.85); // Should multiply current salary by 1.85.
        System.out.println(garrett.getSalary());
    }
}