public class User
{
    private final String c_name;
    private final int c_id;

    public User(String n, int i)
    {
        c_name = n;
        c_id = i;
    }

    public String getName()
    {
        return c_name;
    }
}