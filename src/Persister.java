import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Persister
{
    public static void saveUsers(UserList userList) throws IOException
    {
        File file = new File("users.txt");
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
