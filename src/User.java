public class User
{
    public int c_id;
    public String c_nam;
    public String address;

    public User(int i, String n) {
        c_id = i;
        setName(n);
    }

    public void setName(String n) {
        if (n == null || n.isBlank() || n.length() > 100) {
            throw new IllegalArgumentException("Navnet skal indeholde tekst og må højst være 100 tegn.");
        }
        c_nam = n;
    }

    public void setAdress(String a)
    {
        this.address = a;
    }

    public int getiId(){ return c_id; }

    public String getName(){ return c_nam; }

    public String getAdress() { return address; }

    @Override
    public boolean equals(Object other) {
        if (other instanceof User user) {
            return java.util.Objects.equals(c_nam, user.c_nam);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(c_nam);
    }
}
