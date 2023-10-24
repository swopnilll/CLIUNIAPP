package controllers;

import models.Database;
import models.Student;
import utilities.InputScanner;
import utilities.Utils;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class StudentSystem {

    private final InputScanner inputScanner;

    public StudentSystem(InputScanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void displayMenu() {
        System.out.println("Student Menu:");
        System.out.println("(l) Login");
        System.out.println("(r) Register");
        System.out.println("(x) Exit");
        System.out.print("Select an option: ");
    }

    // Method to register a student
    private Student registerStudent() {
        String name = inputScanner.getStringInput("Enter your name:");
        String email = inputScanner.getStringInput("Enter your email: ");
        String password = inputScanner.getStringInput("Enter your password");

        // Create a new Student object and add it to the list
        Student newStudent = new Student( name, email, password);

        Database.saveStudentsData(newStudent);

        return newStudent;
    }

    public char handleUserChoice(char choice) {
        switch (choice) {
            case 'l':
                // Handle student login
                System.out.println("Logging in as a student...");
                // Implement your logic for student login
                break;
            case 'r':
                // Handle student registration
                System.out.println("Welcome to Regsitration Panel...");
                registerStudent();
                // Implement your logic for student registration
                break;
            case 'x':
                System.out.println("Exiting the Student menu.");
                // You can choose to perform any necessary cleanup or return to the main menu here.
                break;
            default:
                System.out.println("Invalid choice in Student menu. Please select a valid option.");
        }
        return choice; // Return the choice for further handling in the calling code
    }



    public char getCharInput(String prompt) {
        return inputScanner.getCharInput(prompt);
    }

}
