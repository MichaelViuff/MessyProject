public class User
{
  public int userId;
  public String name;

  public User(String name, int userId)
  {
    this.userId = userId;
    if (name.length() < 0 || name.length() > 100)
    {
      return;
    }
    this.name = name;
  }

  public void setName(String name)
  {
    if (name.length() < 0)
    {
      return;
    }
    this.name = name;
  }

  public int getUserId()
  {
    return userId;
  }

  public String getName()
  {
    return name;
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
