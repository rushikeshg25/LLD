public class Guest {
    private final String name;
    private final String id;
    private final String phoneNum;

    public Guest(String name, String id, String phoneNum) {
        this.name = name;
        this.id = id;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
}
