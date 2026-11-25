import java.util.Objects;

public class User
{
    public int c_id;
    public String c_nam;

    public User(String n, int i){
        c_id = i;
        if(n.length() < 0 || n.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = n;
    }

    public void setC_nam(String n)
    {
        if(n.length() > 100 || n == null)
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = n;
    }
    public int geti(){ return c_id; }

    public String getn(){ return c_nam; }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (!(o instanceof User u)) {
            return false;
        }
        return Objects.equals(u.c_nam, c_nam);
    }
}
