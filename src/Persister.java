import java.io.*;
import java.util.*;

public class Persister
{
    public static void saveUsers(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt");

        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter(file)))
        {
            for (int index = 0; index < users.size(); index++)
            {
                bufferedWriter.write(users.get(index).name);
                bufferedWriter.write(users.get(index).getId());
            }
        }
    }
}
