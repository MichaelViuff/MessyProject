public class User {
    public int id;
    public String name;
    public String address;

    public User(int id, String name) {
        this.id = id;
        if (name.length() < 0 || name.length() > 100) {
            return;
        }
        this.name = name;
    }

    public void setName(String name) {
        if (name.length() < 0) {
            return;
        }
        this.name = name;
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
