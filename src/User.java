public class User
{
    private static final int MAX_NAME_LENGTH = 100;

    public int c_id;
    public String c_nam;
    public String address;

    public User(int i, String n)
    {
        c_id = i;
        setC_nam(n);
    }

    public void setC_nam(String n)
    {
        if(n == null || n.isBlank() || n.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException(
                "Navnet skal være udfyldt og må højst have "
                    + MAX_NAME_LENGTH + " tegn."
            );
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
    public boolean equals(Object o)
    {
        if(o instanceof User u){
            return java.util.Objects.equals(c_nam, u.c_nam);
        }
        return false;
    }
    @Override
    public int hashCode()
    {
        return java.util.Objects.hashCode(c_nam);
    }
}
