import java.util.Objects;

public class User
{
  public int userId;
  public String name;

  public User(String name, int userId)
  {
    this.userId = userId;
    setName(name);
  }

  public void setName(String name)
  {
    if (name == null || name.isEmpty() || name.length() > 100)
    {
      throw new IllegalArgumentException("Invalid name! Try again.");
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
      return Objects.equals(u.name, name);
    }
    return false;
  }
}
