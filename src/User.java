public class User
{
    private int id;
    private String name;
    private String address;

    public User(int id, String name){
        this.id = id;
        setName(name);
    }

    public void setName(String name)
    {
        if (name.length() < 0 || name.length() > 100) // Testing length
        {
            throw new IllegalArgumentException("Name must be between 0 and 100 characters long.");
        }
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getId(){ 
        return id; }

    public String getName(){ 
        return name; }

    public String getAddress(){ 
        return address; }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return java.util.Objects.equals(u.name, name);
        }
        return false;
    }
}
