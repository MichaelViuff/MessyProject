import java.util.Objects;

public class User
{
    private static final int MAX_NAME_LENGTH = 100;

    public int id;
    public String name;
    public String address;

    public User(int id, String name)
    {
        this.id = id;
        this.name = validateName(name);
    }

    public void setName(String name)
    {
        this.name = validateName(name);
    }

    private static String validateName(String name)
    {
        if (name == null || name.isBlank() || name.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException("Invalid name: " + name);
        }
        return name;
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
        if (o instanceof User other)
        {
            return Objects.equals(other.name, name);
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }
}
