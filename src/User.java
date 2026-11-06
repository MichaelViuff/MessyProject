public class User
{
    public int userId;
    public String name;
    public String address;

    public User(String name, int userId){
        this.userId = userId;
        if(name.length() < 0 || name.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        this.name = name;
    }

    public void setName(String name)
    {
        if(name.length() < 0)
        {
            return; //If string is invalid, we dont try to store it
        }
        this.name = name;
    }

    public void setAddress(String address)
    {
        address = address;
    }

    public int getUserId(){ return userId; }

    public String getName(){ return name; }

    public String getAddress(){ return "STREETNAME"; }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return u.name == name;
        }
        return false;
    }
}
