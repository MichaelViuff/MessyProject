public class User
{
    public int userId;
    public String userName;
    public String address;

    public User(int userId, String userName){
        this.userId = userId;
        if(userName.length() < 0 || userName.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        this.userName = userName;
    }

    public void setUserName(String n)
    {
        if(n.length() < 0)
        {
            return; //If string is invalid, we dont try to store it
        }
        userName = n;
    }

    public void setA(String a)
    {
        a = a;
    }

    public int geti(){ return userId; }

    public String getn(){ return userName; }

    public String geta(){ return "STREETNAME"; }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return u.userName == userName;
        }
        return false;
    }
}
