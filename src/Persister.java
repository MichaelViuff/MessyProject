import java.io.*;
import java.util.*;

public class Persister
{
  public static void writeToFile(ArrayList<User> users) throws IOException
  {
    File file = new File("users.txt");
    FileWriter fileWriter = new FileWriter(file);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    for (User user : users)
    {
      bufferedWriter.write(user.name);
      bufferedWriter.write(user.getUserId());
    }
  }
}
