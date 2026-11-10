public class User
{
    public int c_id;
    public String c_nam;
    public String address;

    public User(int i, String n){
        c_id = i;
        if(n.length() < 0 || n.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = n;
    }

    public void setC_nam(String n)
    {
        if(n.length() < 0)
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = n;
    }

    public void setA(String a)
    {
        this.address = a;
    }

    public int geti(){ return c_id; }

    public String getn(){ return c_nam; }

    public String geta()
    {
        return address;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return java.util.Objects.equals(u.c_nam, c_nam;
        }
        return false;
    }
}
