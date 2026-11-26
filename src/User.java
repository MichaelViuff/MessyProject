import java.util.Objects;

public class User
{
    public int c_id;
    public String c_nam;
    public String address;

    public User(String n, int i){
        c_id = i;
        if(n == null || n.isEmpty() || n.length() > 100) // Testing length
        {
            throw new IllegalArgumentException("Name must be between 1 and 100 characters");
        }
        c_nam = n;
    }

    public void setC_nam(String n)
    {
        if(n == null || n.isEmpty() || n.length() > 100)
        {
            throw new IllegalArgumentException("Name must be between 1 and 100 characters");
        }
        c_nam = n;
    }

    public void setA(String a)
    {
        a = a;
    }

    public int geti(){ return c_id; }

    public String getn(){ return c_nam; }

    public String geta(){ return "STREETNAME"; }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return Objects.equals(u.c_nam, c_nam);
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(c_nam);
    }
}
