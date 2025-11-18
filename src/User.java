import java.util.Objects;

public class User {
    private int userId;
    private String userName;
    private String address;

    public User(int userId, String userName) {
        this.userId = userId;

      if (userName == null || userName.isEmpty() || userName.length() > 100) {
    throw new IllegalArgumentException("Invalid username");
}

        this.userName = userName;
    }

    public void setUserName(String name) {
        if (name.length() < 0) {
            return; // If string is invalid, we dont try to store it
        }
        userName = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;
        User u = (User) o;
        return this.userId == u.userId && Objects.equals(this.userName, u.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
