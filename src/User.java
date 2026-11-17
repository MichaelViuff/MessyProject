public class User {
    private static final int MAX_NAME_LENGTH = 100;

    public int c_id;
    public String c_nam;
    public String address;

    public User(int i, String n) {
        if (i <= 0) {
            throw new IllegalArgumentException("User ID must be positive");
        }
        if (n == null || n.isBlank() || n.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(
                    "Name must be non-blank and at most " + MAX_NAME_LENGTH + " characters");
        }
        c_id = i;
        c_nam = n;
    }

    public int geti() {
        return c_id;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof User u) {
            return u.c_nam == c_nam;
        }
        return false;
    }
}
