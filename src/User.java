public class User {
    public static final int MAX_NAME_LENGTH = 100;
    public final int id;
    private String name;
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
        if (name == null || name.isEmpty() || name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("Navnet skal være mellem 1 og " + MAX_NAME_LENGTH + " tegn.");
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
            return java.util.Objects.equals(u.name, name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(name);
    }
}
