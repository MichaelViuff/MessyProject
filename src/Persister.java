import java.io.*;
import java.util.*;

public class Persister
{
  public static void writeToFile(ArrayList<User> users) throws IOException
  {
    File file = new File("users.txt");

    try (BufferedWriter bufferedWriter = new BufferedWriter(
        new FileWriter(file)))
    {
      for (User user : users)
      {
        bufferedWriter.write(user.getName());
        bufferedWriter.write("\t");
        bufferedWriter.write(String.valueOf(user.getUserId()));
        bufferedWriter.newLine();
      }
    }
  }
}
