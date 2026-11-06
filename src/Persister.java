import java.io.*;
import java.util.*;

public class Persister
{
    public static void writeToFile(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(int i=0;i<users.size()-1;i++)
        {
            bufferedWriter.write(users.get(i).name);
            bufferedWriter.write(users.get(i).getUserId());
        }
    }
}
