
public class User
{
    public int c_id;
    public String c_nam;
    public String address;

    public User(int i, String n) {
        validateName(n);
        c_id = i;
        c_nam = n;
    }

    private static void validateName(String name) {
        if (name == null || name.isBlank() || name.length() > 100) {
            throw new IllegalArgumentException("Invalid username");
        }
    }

    public void setC_nam(String n)
    {
        validateName(n);
        c_nam = n;
    }

    public void setA(String a)
    {
        this.address = a;
    }

    public int geti(){ return c_id; }

    public String getn(){ return c_nam; }

    public String geta(){ return "STREETNAME"; }

    @Override
    public boolean equals(Object o) {
        if (o instanceof User u) {
            return java.util.Objects.equals(u.c_nam, c_nam);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(c_nam);
    }
}
