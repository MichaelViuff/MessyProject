import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Persister
{
    public static final String DEFAULT_FILE_NAME = "users.txt";

    public static void saveUsers(UserList userList, String fileName) throws IOException
    {
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            for (User user : userList.getUsers())
            {
                writer.write(user.getName() + ";" + user.getId());
                writer.newLine();
            }
        }
    }
}
