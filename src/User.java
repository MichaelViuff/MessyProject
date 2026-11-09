public class User
{
  public int client_id;
  public String client_name;
  public String address;

  public User(String name, int id)
  {
    client_id = id;
    if (name.length() > 100) // Testing length is below 100
    {
      return; //If string is invalid, return nothing
    }
    client_name = name;
  }

  public void setClient_name(String name)
  {
    if (name.isEmpty())
    {
      return; //If string is invalid, return nothing
    }
    client_name = name;
  }

  public int getId()
  {
    return client_id;
  }

  public String getName()
  {
    return client_name;
  }

  public String getAddress()
  {
    return address;
  }

  @Override public boolean equals(Object o)
  {
    if (o instanceof User user)
    {
      return user.client_name == client_name;
    }
    return false;
  }
}
