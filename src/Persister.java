import java.io.*;
import java.util.*;

public class Persister
{
    public static void s(ArrayList<User> u, String fileName) throws IOException
    {
        File file = new File(fileName);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file)))
        {
            for(int x=0;x<u.size();x++)
            {
                User user = u.get(x);

                bw.write(user.c_nam);
                bw.write(", ");
                bw.write(String.valueOf(user.geti()));
                bw.newLine();
            }
        } // Ending parenthesis
    }
}
