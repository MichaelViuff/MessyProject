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
        setC_nam(name);
    }

    public void setC_nam(String name)
    {
        if(name == null || name.isBlank() || name.length() > MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException("Invalid user name");
        }
        this.name = name;
    }

    public void setA(String address)
    {
        this.address = address;
    }

    public int geti(){ return id; }

    public String getn(){ return name; }

    public String geta(){ return address; }

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
