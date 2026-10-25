import java.util.Objects;

public class User {
    public int c_id;
    public String c_nam;
    public String address;

    // Create a user with a validated name and ID
    public User(String n, int i) {
        validateName(n);
        c_id = i;
        c_nam = n;
    }

    // Check that the name is valid
    private void validateName(String n) {
        if (n == null || n.isBlank() || n.length() > 100) {
            throw new IllegalArgumentException("Invalid username");
        }
    }

    // Update the user's name
    public void setC_nam(String n) {
        validateName(n);
        c_nam = n;
    }

    // Update the user's address
    public void setA(String a) {
        if (a == null || a.isBlank()) {
            throw new IllegalArgumentException("Invalid address");
        }

        address = a;
    }

    // Return the user's ID
    public int geti() {
        return c_id;
    }

    // Return the user's name
    public String getn() {
        return c_nam;
    }

    // Return the user's address
    public String geta() {
        return address;
    }

    // Users are considered equal if their names match
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof User user)) {
            return false;
        }

        return Objects.equals(c_nam, user.c_nam);
    }

    // Keep hashCode consistent with equals
    @Override
    public int hashCode() {
        return Objects.hash(c_nam);
    }
}