import java.util.Objects;

public class User
{
    public static final int MAX_NAME_LENGTH = 100;

    private int id;
    private String name;
    private String address;

    public User(String name, int id)
    {
        this.id = id;
        if (name == null || name.isEmpty() || name.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException("Name must be between 1 and " + MAX_NAME_LENGTH + " characters");
        }
        this.name = name;
    }

    public void setName(String name)
    {
        if (name == null || name.isEmpty() || name.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException("Name must be between 1 and " + MAX_NAME_LENGTH + " characters");
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
        return Objects.hashCode(name);
    }

    @Override
    public String toString()
    {
        return "User{id=" + id + ", name='" + name + "', address='" + address + "'}";
    }
}
