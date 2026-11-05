import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Persister
{
    public static void saveUsers(ArrayList<User> u) throws IOException
    {
        try (BufferedWriter bw =
                 new BufferedWriter(new FileWriter("users.txt")))
        {
            for (int x = 0; x < u.size(); x++)
            {
                 bw.write(u.get(x).getn());
                 bw.write(";");

                 bw.write(Integer.toString(u.get(x).geti()));
                 bw.newLine();
            }
        }
    }
}
