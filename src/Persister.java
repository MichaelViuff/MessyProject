import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class Persister
{
    public static void saveUsers(List<User> users, Path filePath) throws IOException
    {
        Objects.requireNonNull(users, "users");
        Objects.requireNonNull(filePath, "filePath");

        try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardCharsets.UTF_8))
        {
            for (User user : users)
            {
                Objects.requireNonNull(user, "users must not contain null");
                writer.write(user.getName());
                writer.write('\t');
                writer.write(Integer.toString(user.getId()));
                writer.newLine();
            }
        }
    }
}
