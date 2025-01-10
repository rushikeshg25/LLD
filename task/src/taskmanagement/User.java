package taskmanagement;

public class User {
    private final String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }



    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "taskmanagement.User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
