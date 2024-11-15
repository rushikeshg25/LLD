package users;

public class User {
    private String email;
    private String name;
    private UserType type;

    public User(String email, String name, UserType type) {
        this.email = email;
        this.name = name;
        this.type = type;
    }

}
