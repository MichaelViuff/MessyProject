public class User
{
    private final String c_nam;
    private final int c_id;

    public User(String n, int i)
    {
        c_nam = n;
        c_id = i;
    }

    public String getName()
    {
        return c_nam;
    }
}