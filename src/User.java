public class User
{
    private final int id;
    private String name;
    private String address;

    public User(int id, String name)
    {
        this.id = id;
        if (name.length() < 0 || name.length() > 100)
        {
            return;
        }
        this.name = name;
    }

    public void setName(String name)
    {
        if (name.length() < 0)
        {
            return;
        }
        this.name = name;
    }

    public void setAddress(String address)
    {
        address = address;
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
        return "STREETNAME";
    }

    @Override
    public boolean equals(Object other)
    {
        if (other instanceof User user)
        {
            return user.name == name;
        }
        return false;
    }
}
