public class User
{
  public int ID;
  public String name;

  public User(int i, String n)
  {
    ID = i;
    if (n.length() > 100) // Testing length
    {
      return; //If string is invalid, we don't try to store it
    }
    name = n;
  }

  public int getID()
  {
    return ID;
  }

  @Override public boolean equals(Object o)
  {
    if (o instanceof User u)
    {
      return u.name.equals(name);
    }
    return false;
  }
}
