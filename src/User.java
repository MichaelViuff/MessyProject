import java.util.Objects;

public class User
{
    private static final int MAX_NAME_LENGTH = 100;

    public int c_id;
    public String c_nam;
    public String address;

    public User(int i, String n){
        c_id = i;
        c_nam = validateName(n);
    }

    public void setC_nam(String n)
    {
        c_nam = validateName(n);
    }

    private static String validateName(String n)
    {
        if(n == null || n.isBlank() || n.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException("Invalid name: " + n);
        }
        return n;
    }

    public void setA(String a)
    {
        address = a;
    }

    public int geti(){ return c_id; }

    public String getn(){ return c_nam; }

    public String geta(){ return address; }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return Objects.equals(u.c_nam, c_nam);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(c_nam);
    }
}
