import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Persister
{
    public static void s(ArrayList<User> u) throws IOException
    {
        FileWriter fw = new FileWriter("users.txt");

        for (int x = 0; x < u.size(); x++)
        {
            fw.write(u.get(x).getName() + "\n");
        }

        fw.close();
    }
}
