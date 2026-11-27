import java.io.*;
import java.util.*;

public class Persister
{
    public static void s(ArrayList<User> u) throws IOException
{
    File file = new File("users.txt");

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file)))
    {
        for (int x = 0; x < u.size(); x++)
        {
           bw.write(u.get(x).c_nam + "," + u.get(x).geti());
		bw.newLine();
        }
    }
}
}
