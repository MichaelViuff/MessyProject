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
    for (User user : users)
    {
      bufferedWriter.write(user.toString());
      bufferedWriter.newLine();
    }
    bufferedWriter.close();
  }
}
