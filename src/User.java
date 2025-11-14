public class User
{
    public static int ID;
    public String name;
    public String address;

    public User(int id, String name){
        ID = id;
        if(name.isEmpty() || name.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        this.name = name;
    }

    public void setName(String name)
    {
        if(name.isEmpty())
        {
            return; //If string is invalid, we dont try to store it
        }
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getID(){ return ID; }

    public String getName(){ return name; }

    public String getAddress(){ return address; }

    @Override
    public boolean equals(Object object){
        if(object instanceof User){

            return (User) object.name == name;
        }
        return false;
    }
}
