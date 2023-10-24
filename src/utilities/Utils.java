package utilities;

import java.util.Random;

public class Utils {
    // Method to generate a unique student ID
    public static int generateUniqueStudentID() {
        int uniqueID;
        // Implement logic to generate a unique student ID
        // You can use a random generator or maintain a counter
        // Ensure the ID is unique and follows the formatting rules.
        Random random = new Random();
        uniqueID = random.nextInt(999999) + 1; // Generates a random ID between 1 and 999999 (inclusive)

        // Format the ID to have 6 digits, completing with leading zeros if necessary
        String formattedID = String.format("%06d", uniqueID);

        return Integer.parseInt(formattedID); // Convert back to an integer
    }
}
