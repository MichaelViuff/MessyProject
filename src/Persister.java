import java.io.*;
import java.util.ArrayList;

public class Persister
{
    public static void saveUsers(ArrayList<User> users, String fileName) throws IOException
    {
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            for (User user : users)
            {
                writer.write(user.getName());
                writer.write(" ");
                writer.write(String.valueOf(user.getId()));
                writer.newLine();
            }
        }
    }
}