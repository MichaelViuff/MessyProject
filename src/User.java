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

  public void setC_nam(String n)
  {
    if (n.length() < 0)
    {
      return; //If string is invalid, we dont try to store it
    }
    name = n;
  }

  public void setA(String a)
  {
    a = a;
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
