import java.io.*;
import java.util.*;

public class Persister
{
    public static void persistUsers(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(int x = 0; x < users.size(); x++)
        {
            bufferedWriter.write(users.get(x).name);
            bufferedWriter.write(users.get(x).getName() + "," + users.get(x).getId() +"\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
