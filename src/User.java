public class User {
    public int id;
    public String name;
    public String address;

    public User(int id, String name) {
        this.id = id;
        validateName(name);
        this.name = name;
    }

    public void setName(String name) {
        validateName(name);
        this.name = name;
    }

    private static void validateName(String name) {
        if (name == null || name.isEmpty() || name.length() > 100) {
            throw new IllegalArgumentException("Navnet skal være mellem 1 og 100 tegn.");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof User u) {
            return u.name == name;
        }
        return false;
    }
}
