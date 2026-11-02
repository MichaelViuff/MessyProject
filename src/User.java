public class User
{
    public int id;
    public String name;
    public String address;

    public User(int id, String name){
        this.id = id;
        if(name == null || name.length() < 0 || name.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        this.name = name;
    }

    public void setC_nam(String name)
    {
        if(name.length() == 0)
        {
            return; //If string is invalid, we dont try to store it
        }
        this.name = name;
    }

  public void setA(String address)
  {
    this.address = address;
  }

    public int getId(){ return id; }

    public String getName(){ return name; }

  public String getAddress()
  {
    return address;
  }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return java.util.Objects.equals(u.name, name);
        }
        return false;
    }
}
