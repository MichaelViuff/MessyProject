import java.util.Objects;

public class User
{
    public int id;
    public String name;
    public String address;

    public User(String name, int id){
        this.id = id;
        if(name.isEmpty() || name.length() > 100) // Testing length
        {
            return;
        }
        this.name = name;
    }

    public void setName(String name)
    {
        if(!name.isEmpty())
          this.name = name;
    }

    public void setAddress(String address)
    {
      this.address = address;
    }

    public int getId(){ return id; }

    public String getName(){ return name; }

    public String getAddress(){ return address; }

  @Override public String toString()
  {
    return "User{" + "id=" + id + ", name='" + name + '\'' + ", address='"
        + address + '\'' + '}';
  }

  @Override
    public boolean equals(Object o){
        if(o instanceof User user){
            return Objects.equals(user.name, name);
        }
        return false;
    }

  @Override public int hashCode()
  {
    return Objects.hash(id, name, address);
  }
}
