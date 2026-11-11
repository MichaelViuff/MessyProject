public class User
{
    public int c_id;
    public String c_nam;


    public User(String i, int n){
        c_id = n;
        if(i.length() < 0 || i.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = i;
    }


    public int geti(){ return c_id; }

    public String getn(){ return c_nam; }



    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return u.c_nam == c_nam;
        }
        return false;
    }

    @Override
    public String toString() {
        return "User " + c_nam + ", ID=" + c_id;
    }


}
