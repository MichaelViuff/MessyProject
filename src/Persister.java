import java.io.*;
import java.util.ArrayList;

public class Persister
{
    public static void saveUsers(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            for (int i = 0; i < users.size(); i++)
            {
                writer.write(users.get(i).name);
                writer.write(" ");
                writer.write(String.valueOf(users.get(i).getId()));
                writer.newLine();
            }
        }
    }
}