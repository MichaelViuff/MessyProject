import java.util.Objects;

public class User
{
  private static final int MAX_NAME_LENGTH = 100;
  private final int userId;
  private String name;

  public User(String name, int userId)
  {
    if (userId <= 0)
    {
      throw new IllegalArgumentException("User ID can't be negative or zero!");
    }
    this.userId = userId;
    setName(name);
  }

  public void setName(String name)
  {
    if (name == null || name.isBlank() || name.length() > MAX_NAME_LENGTH)
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

  @Override public int hashCode()
  {
    return Objects.hash(name);
  }

  @Override public String toString()
  {
    return "User" + "\nUser ID: " + userId + "\nName :" + name;
  }
}
