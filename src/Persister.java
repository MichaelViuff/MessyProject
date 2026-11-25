import java.io.*;
import java.util.*;

public class Persister
{
    public static void s(ArrayList<User> users, String fileName) throws IOException
    {
        File file = new File(fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            for(int index=0;index<users.size();index++)
            {
                User user = users.get(index);

                writer.write(user.name);
                writer.write(", ");
                writer.write(String.valueOf(user.geti()));
                writer.newLine();
            }
        } // Ending parenthesis
    }
}
