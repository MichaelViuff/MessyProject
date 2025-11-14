import java.io.*;
import java.util.*;

public class Persister
{
  public static void saveData(ArrayList<User> userList) {
    File file = new File("users.txt");

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
      for (User user : userList)
      {
        bw.write("ID: " + user.getID());
        bw.newLine();
        bw.write("Name: " + user.name);
        bw.newLine();
      }
    } catch (IOException e) {
      System.err.println("Error saving data: " + e.getMessage());
    }
  }
}
