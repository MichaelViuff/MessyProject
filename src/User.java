import java.util.Objects;

public class User
{
  public int c_id;
  public String c_nam;
  public String address;

  public User(int i, String n)
  {

    if (n == null || n.isEmpty() || n.length() > 100) // Testing length
    {
      throw new RuntimeException(
          "Invalid name"); //If string is invalid, we dont try to store it
    }

    this.c_id = i;
    this.c_nam = n;

  }

  public void setC_nam(String n)
  {
    if (n == null || n.isEmpty() || n.length() > 100)
    {
      throw new RuntimeException(
          "Invalid name"); //If string is invalid, we dont try to store it
    }
    c_nam = n;
  }

  public void setA(String a)
  {
    this.address = a;
  }

  public int geti()
  {
    return c_id;
  }

  public String getn()
  {
    return c_nam;
  }

  public String getA()
  {
    return address;
  }

  @Override public boolean equals(Object o)
  {
    if (this == o)
      return true;

    if (!(o instanceof User u))
      return false;

    return c_id == u.c_id && Objects.equals(u.c_nam, c_nam) && Objects.equals(
        u.address, address);

  }
}
