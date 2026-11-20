public class User
{
    public int id;
    public String name;
    public String address;

    public User(int i, String n) {
        id = i;
        setName(n);
    }

    public void setName(String n) {
        if (n == null || n.isBlank() || n.length() > 100) {
            throw new IllegalArgumentException("Navnet skal indeholde tekst og må højst være 100 tegn.");
        }
        name = n;
    }

    public void setAdress(String a)
    {
        this.address = a;
    }

    public int getiId(){ return id; }

    public String getName(){ return name; }

    public String getAdress() { return address; }

    @Override
    public boolean equals(Object other) {
        if (other instanceof User user) {
            return java.util.Objects.equals(name, user.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(name);
    }
}
