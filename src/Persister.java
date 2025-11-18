import java.io.*;
import java.util.*;

public class Persister {
    public static void saveUsers(ArrayList<User> users) {

        File file = new File("users.txt"); // Creates file

        // try with resources added, to avoid forgetting to close the files i.e.
        // bw.close().
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (User user : users) {
                bw.write("Username: " + user.getUserName() + ";"); // Writes username
                bw.write("User ID: " + String.valueOf(user.getUserId())); // Writes userID
                bw.newLine(); // Adds linebreak between users
            }
        } catch (IOException e) {
            System.out.println("Error saving users: " + e.getMessage()); // Catches exceptions and logs them

        }
    }
}
