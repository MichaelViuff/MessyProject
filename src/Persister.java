import java.io.*;
import java.util.*;

public class Persister
{
    public static void s(ArrayList<User> u) throws IOException
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("users.txt"))) {
            for (int x = 0; x < u.size(); x++) {
                bw.write(Integer.toString(u.get(x).geti()) + ": ");
                bw.write(u.get(x).c_nam + "\n");
            }
        }

    }
}

