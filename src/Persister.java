import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Persister {
    public static void saveUsers(ArrayList<User> users) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"))) {
            for (User user : users) {
                writer.write(user.getName() + ", " + user.getiId());
                writer.newLine();
            }
        }
    }
}