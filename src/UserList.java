import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> users = new ArrayList<>();

    public void add(User u)
    {
        if (u == null)
        {
            return; //Tjek først om brugeren mangler
        }
        this.users.add(u); //Tilføj kun hvis brugeren findes
    }

    public ArrayList<User> getUsers()
    {
        return users;
    }
}
