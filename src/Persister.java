import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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
                bufferedWriter.write(", ");
                bufferedWriter.write(String.valueOf(users.get(index).getId()));
                bufferedWriter.newLine();
            }
        }
    }
}
