public class User
{
    private int id;
    private String name;
    private String address;

    public User(int i, String n){
        id = i;
        if(n.length() < 0 || n.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        name = n;
    }

    public void setC_nam(String n)
    {
        if(n.length() < 0)
        {
            return; //If string is invalid, we dont try to store it
        }
        name = n;
    }

    public void setA(String a)
    {
        a = a;
    }

    public int getId(){ 
        return id; }

    public String getName(){ 
        return name; }

    public String getAddress(){ 
        return address; }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return u.c_nam == c_nam;
        }
        return false;
    }
}
