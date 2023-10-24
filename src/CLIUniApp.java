import controllers.UniversitySystem;
import utilities.InputScanner;

public class CLIUniApp {
    public static void main(String[] args) {
        InputScanner inputScanner = new InputScanner(); // Create an instance of InputScanner
        UniversitySystem universitySystem = new UniversitySystem(inputScanner); // Create an instance of UniversitySystem

        System.out.println("Welcome to CLIUniApp - University System");
        char choice;

        do {
            universitySystem.displayMenu(); // Display the University System menu
            choice = inputScanner.getCharInput("Enter your choice: "); // Get user input
            universitySystem.handleUserChoice(choice); // Handle the user's choice

        } while (choice != 'X'); // Continue until the user chooses to exit

        // You can perform any necessary cleanup here before exiting the application.
        System.out.println("Goodbye!");


    }
}