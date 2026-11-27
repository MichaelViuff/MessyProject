import java.util.Objects;

public class User
{
    private static final int MAX_NAME_LENGTH = 100;

    private final int id;
    private String name;
    private String address;

    public User(int id, String name)
    {
        this.id = id;
        setName(name);
    }

    public void setName(String name)
    {
        if (name == null || name.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException("Name must contain between 0 and "
                    + MAX_NAME_LENGTH + " characters.");
        }
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
    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }
        if (!(other instanceof User user))
        {
            return false;
        }
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }
}
