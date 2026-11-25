public class User
{
    public int id;
    public String name;

    public User(int id, String name){
        this.id = id;
        if(name == null || name.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        this.name = name;
    }

    public void setName(String name)
    {
        if(name == null .length() < 100)
        {
            return; //If string is invalid, we dont try to store it
        }
        this.name = name;
    }

    public int getId()
    {
        return id;
    }
    public int getID()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return u.name == name;
        }
        return false;
    }
}
