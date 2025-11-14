import java.io.*;
import java.util.*;

public class Persister
{
  public static void saveToFile(ArrayList<User> users) throws IOException
  {
    File file = new File("users.txt"); // Creates file
    FileWriter fileWriter = new FileWriter(file); // Create filewriter
    BufferedWriter bufferedWriter = new BufferedWriter(
        fileWriter); // Create BufferedWriter
    // Create a loop
    for (User user : users)
    { // Nicely formatted block
      bufferedWriter.write(user.toString());
      bufferedWriter.newLine();
    } // Ending parenthesis
    bufferedWriter.close();
  }
}
