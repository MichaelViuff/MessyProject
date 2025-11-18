import java.io.*;
import java.util.*;

public class Persister {
    public static void saveUsers(ArrayList<User> users){

        File file = new File("users.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
        for (User user : users) {
            bw.write("Username: " + user.getUserName() + ";");
            bw.write("User ID: " + String.valueOf(user.getUserId()));
        }
        } catch (IOException e) {
        System.out.println("Error saving users: " + e.getMessage());
    
    
         // Creates file
        FileWriter fw = new FileWriter(file); // Create filewriter
        BufferedWriter bw = new BufferedWriter(fw); // Create BufferedWriter
        for (int x = 0; x < u.size() - 1; x++) // Create a loop
        { // Nicely formatted block
            bw.write(u.get(x).userName); // Write first thing
            bw.write(u.get(x).geti()); // Write second thing
        } // Ending parenthesis
    }
}
