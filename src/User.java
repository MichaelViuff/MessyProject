public class User
{
    public int c_id;
    public String c_nam;
    public String address;

    public User(int i, String n){
        c_id = i;
        if(n.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = n;
    }

    public int geti(){ return c_id; }


    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return u.c_nam == c_nam;
        }
        return false;
    }
}
