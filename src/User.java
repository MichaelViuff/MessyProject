public class User
{
    public int c_id;
    public String c_nam;
    public String address;

    public User(int i, String n){
        c_id = i;
setC_nam(n);

    }

public void setC_nam(String n)
{
    if (n == null || n.isEmpty() || n.length() > 100)
    {
        throw new IllegalArgumentException("Name must be between 1 and 100 characters.");
    }

    c_nam = n;
}
public void setA(String a)
{
    this.address = a;
}


    public int geti(){ return c_id; }

    public String getn(){ return c_nam; }

   public String getA()
{
    return address;
}

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return c_nam != null && c_nam.equals(u.c_nam);
        }
        return false;
    }
}
