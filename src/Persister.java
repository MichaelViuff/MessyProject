
import java.io.*;
import java.util.ArrayList;

public class Persister {
    public static void s(ArrayList<User> u) throws IOException {
        File file = new File("users.txt");

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int x = 0; x < u.size(); x++) {
            bw.write(u.get(x).c_nam);
            bw.write(String.valueOf(u.get(x).geti()));
            bw.newLine();
        }

        bw.close();
    }
}
