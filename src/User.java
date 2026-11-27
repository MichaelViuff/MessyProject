public class User
{
    private int c_id;
    public String c_name;
    private String address;

    public User(int id, String name){
        c_id = id;
        if(name == null || name.length() > 100) // Testing length
        {
            return; //If string is invalid, we don't try to store it
        }
        c_name = name;
    }

    public void setC_name(String name)
    {
        if(name == null)
        {
            return; //If string is invalid, we don't try to store it
        }
        c_name = name;
    }

    public void setA(String address)
    {
        this.address = address;
    }

    public int getId(){ return c_id; }

    public String getName(){ return c_name; }

    public String getAddress(){ return address; }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return u.c_name.equals(c_name);
        }
        return false;
    }

    @Override
    public String toString() {
        return c_id + ": " + c_name;
    }
}
