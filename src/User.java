public class User
{
    private static final int MAX_NAME_LENGTH = 100;

    public int id;
    public String name;
    public String address;


    public User(int id, String name){
        if(id <= 0)
        {
            throw new IllegalArgumentException("Invalid user ID");
        }
        this.id = id;
        setName(name);
    }

    public void setName(String name)
    {
        if(name == null || name.isBlank() || name.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException("Invalid user name");
        }
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getId(){ return id; }

    public String getName(){ return name; }

    public String getAddress(){ return address; }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof User otherUser){
            return name.equals(otherUser.name);
        }
        return false;
    }
    @Override
    public int hashCode()
    {
        return name.hashCode();
    }
    @Override
    public String toString()
    {
        return "ID: " + id + ", Name: " + name;
    }
}
