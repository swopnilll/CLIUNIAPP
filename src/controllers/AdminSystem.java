package controllers;


import models.Admin;
import models.Database;
import utilities.InputScanner;

public class AdminSystem {

    private final InputScanner inputScanner;
    private final Admin adminInstance; // Create an instance of the Admin class

    public AdminSystem(InputScanner inputScanner) {
        this.inputScanner = inputScanner; // Initialize the instance variable
        this.adminInstance = new Admin(); // Initialize the instance variable
    }

    public void displayMenu() {
        System.out.println("Admin Menu:");
        System.out.println("(c) Clear Database File");
        System.out.println("(g) Group Students");
        System.out.println("(p) Partition Students");
        System.out.println("(r) Remove Student by ID");
        System.out.println("(s) Show All Students");
        System.out.println("(x) Exit");
        System.out.print("Select an option: ");
    }

    public char handleUserChoice(char choice) {
        switch (choice) {
            case 'c':
                // Handle clearing the database file
                System.out.println("Clearing the database file...");
                // Implement your logic for clearing the database file
                break;
            case 'g':
                // Handle grouping students
                System.out.println("Grouping students...");
                // Implement your logic for grouping students
                break;
            case 'p':
                // Handle partitioning students
                System.out.println("Partitioning students...");
                // Implement your logic for partitioning students
                break;
            case 'r':
                // Handle removing a student by ID
                System.out.println("Removing a student by ID...");
                // Implement your logic for removing a student by ID
                break;
            case 's':
                // Handle showing all students
                System.out.println("Showing all students...");
                // Implement your logic for showing all students
                break;
            case 'x':
                System.out.println("Exiting the Admin menu.");
                // You can choose to perform any necessary cleanup or return to the main menu here.
                break;
            default:
                System.out.println("Invalid choice in Admin menu. Please select a valid option.");
        }
        return choice; // Return the choice for further handling in the calling code
    }

    public void handleAdminChoice(char adminChoice, AdminSystem adminSystem) {
        switch (adminChoice) {
            case 'c':
                // Handle choice 'c' for clearing the database file
                Database.clearDatabase();
                break;
            case 'g':
                // Handle choice 'g' for grouping students
                adminInstance.groupStudents();
                break;
            case 'p':
                // Handle choice 'p' for partitioning students
                adminInstance.partitionStudents();
                break;
            case 'r':
                // Handle choice 'r' for removing a student
                int studentID = inputScanner.getIntInput("Please enter student id");
                adminInstance.removeStudent(studentID);
                break;
            case 's':
                // Handle choice 's' for viewing all students
                adminInstance.showStudents();
                break;
            case 'x':
                System.out.println("Exiting the Admin menu.");
                // You can choose to perform any necessary cleanup or return to the main menu here.
                break;
            default:
                System.out.println("Invalid choice in Admin menu. Please select a valid option.");
        }
    }

    public char getCharInput(String prompt) {
        return inputScanner.getCharInput(prompt);
    }


}
