package controllers;

import utilities.InputScanner;

public class UniversitySystem {
    private final InputScanner inputScanner;

    public UniversitySystem(InputScanner inputScanner){
        this.inputScanner = inputScanner; // Initialize the instance variable
    }
    public void displayMenu() {
        System.out.println("Please select an option:");
        System.out.println("(A) Admin");
        System.out.println("(S) Student");
        System.out.println("(X) Exit");
        System.out.print("Your choice: ");
    }

    public void handleUserChoice(char choice) {
        switch (choice) {
            case 'A':
                // Navigate to the Admin menu
                System.out.println("Entering the Admin menu...");
                AdminSystem adminSystem = new AdminSystem(inputScanner);
                adminSystem.displayMenu(); // Display the Admin menu
                char adminChoice = adminSystem.handleUserChoice(adminSystem.getCharInput("Enter your choice for the Admin menu: ")); // Get user input for the Admin menu
                adminSystem.handleAdminChoice(adminChoice,adminSystem );
                break;
            case 'S':
                // Navigate to the Student menu
                System.out.println("Entering the Student menu...");
                StudentSystem studentSystem = new StudentSystem(inputScanner);
                studentSystem.displayMenu(); // Display the Student menu
                char StudentChoice = studentSystem.handleUserChoice(studentSystem.getCharInput("Enter your choice for the Admin menu: ")); // Get user input for the Admin menu
                System.out.println(StudentChoice);
                break;
            case 'X':
                System.out.println("Exiting the University System. Goodbye!");
                // You can choose to perform any necessary cleanup or exit the application here.
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }


}
