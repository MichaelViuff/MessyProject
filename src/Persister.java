import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Persister
{
    public static void saveUsers(ArrayList<User> u, String fileName) throws IOException
    {
        try (BufferedWriter bw =
                 new BufferedWriter(new FileWriter(fileName)))
        {
            for (int x = 0; x < u.size(); x++)
            {
                 bw.write(u.get(x).getName());
                 bw.write(";");

                 bw.write(Integer.toString(u.get(x).getId()));
                 bw.newLine();
            }
        }
    }
}
