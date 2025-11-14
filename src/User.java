public class User
{
  public int id;
  public String name;
  public String address;

  public User(int id, String name)
  {
    this.id= id;
    this.name = name;
  }

  public void setName(String name)
  {
    this.name=name;
  }

  public void setId(int id)
  {
    this.id=id;
  }

  public int geti()
  {
    return id;
  }

  public String getn()
  {
    return name;
  }

  public String geta()
  {
    return "STREETNAME";
  }

  @Override public boolean equals(Object o)
  {
    if (o instanceof User u)
    {
      return u.name == name;
    }
    return false;
  }
}
