public class User
{
    public int c_id;
    public String c_nam;
    public String address;

    public User(int i, String n){
        if(i <= 0)
        {
            throw new IllegalArgumentException("Invalid user ID");
        }
        c_id = i;
        if(n == null || n.isBlank() || n.length() > 100)
        {
            throw new IllegalArgumentException("Invalid user name");
        }
        c_nam = n;
    }

    public void setC_nam(String n)
    {
        if(n == null || n.isBlank() || n.length() > 100)
        {
            throw new IllegalArgumentException("Invalid user name");
        }
        c_nam = n;
    }

    public void setA(String a)
    {
        this.address = a;
    }

    public int geti(){ return c_id; }

    public String getn(){ return c_nam; }

    public String geta(){ return address; }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return c_nam.equals(u.c_nam);
        }
        return false;
    }
    @Override
    public int hashCode()
    {
        return c_nam.hashCode();
    }
}
