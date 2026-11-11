public class User
{
    public int c_id;
    public String c_nam;


    public User(String Name, int ID){
        c_id = ID;
        if(Name.length() < 0 || Name.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = Name;
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
