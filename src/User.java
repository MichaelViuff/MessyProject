public class User
{
    public int c_id;
    public String c_nam;
    public String address;

    public User(String n, int i) {
        c_id = i;
        if (n == null || n.length() == 0 || n.length() > 100)
        {
            return;
        }
    }

    public void setC_nam(String n)
    {
        if(n == null || n.length() == 0)
        {
            return;
        }

        c_nam = n;
    }

    public void setA(String a)
    {
        if (a == null || a.length() == 0)
        {
            return;
        }

        address = a;
    }

    public int geti(){ return c_id; }

    public String getn(){ return c_nam; }

  public String geta() {
    return address;
  }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return u.c_nam.equals(c_nam);
        }
        return false;
    }
    public User getu(User user)
    {
        for (User u : this.u)
        {
            if (u.equals(user))
            {
                return u;
            }
        }
        return null;
    }
}
