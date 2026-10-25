import java.io.*;
import java.util.*;

public class Persister
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("users.txt"); // Creates file
        FileWriter fw = new FileWriter(file); // Create filewriter
        BufferedWriter bw = new BufferedWriter(fw); // Create BufferedWriter
        for (int x = 0; x < u.size(); x++) // Create a loop
        { // Nicely formatted block
            bw.write(u.get(x).c_nam); // Write first thing
            bw.write(" ");
            bw.write(String.valueOf(u.get(x).geti())); // Write second thing
            bw.newLine();
        } // Ending parenthesis
        bw.close(); // Close the file after writing all users
    }
}
