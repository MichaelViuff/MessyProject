public class User
{
    private static final int MAX_NAME_LENGTH = 100;

    public int id;
    public String name;
    public String address;

    public User(int i, String n)
    {
        id = i;
        setName(n);
    }

    public void setName(String n)
    {
        if (n == null || n.isBlank() || n.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException(
                "Navnet skal være udfyldt og må højst have "
                    + MAX_NAME_LENGTH + " tegn."
            );
        }

        name = n;
    }

    public void setA(String a)
    {
        address = a;
    }

    public int geti()
    {
        return id;
    }

    public String getn()
    {
        return name;
    }

    public String geta()
    {
        return address;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof User u)
        {
            return java.util.Objects.equals(name, u.name);
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        return java.util.Objects.hashCode(name);
    }

    @Override
    public String toString()
    {
        return "ID: " + id + ", navn: " + name;
    }
}