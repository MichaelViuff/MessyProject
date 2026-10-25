import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Persister {

    // Save all users to users.txt
    public static void s(ArrayList<User> users) throws IOException {
        try (BufferedWriter bw =
            new BufferedWriter(new FileWriter("users.txt"))) {

            for (User user : users) {
                bw.write(user.getn());
                bw.write(" ");
                bw.write(String.valueOf(user.geti()));
                bw.newLine();
            }
        }
    }
}