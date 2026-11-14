import java.io.*;
import java.util.ArrayList;

public class Persister
{
    public static void save(ArrayList<User> users) throws IOException
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt")))
        {
            for (User user : users)
            {
                writer.write(user.getName());
                writer.write(";");
                writer.write(Integer.toString(user.getId()));
                writer.newLine();
            }
        }
    }
}
