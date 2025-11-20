public class User
{
  public int c_id;
  public String c_nam;
  public String address;

  public User(String n, int i){
    if(n == null || n.length() == 0 || n.length() > 100) { // Testing length
      return;
    }
    c_nam = n;
    c_id = i;
  }

  public void setC_name(String n)
  {
    if(n == null || n.length() == 0) {
      return; //If string is invalid, we don't try to store it
    }
    c_nam = n;
  }

  public void setA(String a)
  {
    this.address = a;
  }

  public String geta(){
    return address; }

  public String getn(){
    return c_nam; }

  public int geti(){
    return c_id;
  }



  @Override
  public boolean equals(Object o){
    if(o instanceof User u){
      return u.c_nam.equals(c_nam);
    }
    return false;
  }
}

