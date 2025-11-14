import java.io.*;
import java.util.*;

public class Persister
{
  public static void saveData(ArrayList<User> userList) {
    File file = new File("users.txt");

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
      for (int x = 0; x < userList.size(); x++) {
        bw.write("ID: " + userList.get(x).getID());
        bw.newLine();
        bw.write("Name: " + userList.get(x).name);
        bw.newLine();
      }
    } catch (IOException e) {
      System.err.println("Error saving data: " + e.getMessage());
    }
  }
}
