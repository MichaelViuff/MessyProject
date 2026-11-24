import java.io.*;
import java.util.*;

public class Persister
{
    public static void saveUsers(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        for (int i = 0; i < users.size() - 1; i++)
        {
            writer.write(users.get(i).c_nam);
            writer.write(users.get(i).geti());
        }
    }
}
