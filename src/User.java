public class User {
    public int userId;
    public String userName;
    public String address;

    public User(int userId, String userName) {
        this.userId = userId;
        if (userName.length() < 0 || userName.length() > 100) // Testing length
        {
            return; // If string is invalid, we dont try to store it
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
        if (o instanceof User u) {
            return u.userName == userName;
        }
        return false;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + ", getUserId()="
                + getUserId() + ", getUserName()=" + getUserName() + ", getAddress()=" + getAddress() + ", toString()="
                + super.toString() + "]";
    }

    
}
