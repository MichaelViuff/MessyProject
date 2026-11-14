
import java.util.Objects;

public class User
{
    private static final int MAX_NAME_LENGTH = 100;

    private int id;
    private String name;
    private String address;

    public User(int id, String name)
    {
        validateName(name);
        this.id = id;
        this.name = name;
    }

    private static void validateName(String name)
    {
        if (name == null || name.isBlank() || name.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException("Invalid username");
        }
    }

    public void setName(String name)
    {
        validateName(name);
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof User user)
        {
            return Objects.equals(user.name, name);
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(name);
    }
}
