public class User
{
  public static int ID;
  public String name;

  public User(int id, String name)
  {
    ID = id;
    if (name.length() > 100) // Testing length
    {
      return; //If string is invalid, we don't try to store it
    }
    this.name = name;
  }

  public int getID()
  {
    return ID;
  }

  @Override public boolean equals(Object object)
  {
    if (this == object)
      return true;
    if (object == null || getClass() != object.getClass())
      return false;

    User other = (User) object;
    return this.name != null && this.name.equals(other.name);
  }
}
