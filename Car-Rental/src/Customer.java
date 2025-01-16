public class Customer {
    private final String name;
    private final String contact;
    private final String drivingInfo;

    public Customer(String name, String contact, String drivingInfo) {
        this.name = name;
        this.contact = contact;
        this.drivingInfo = drivingInfo;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getDrivingInfo() {
        return drivingInfo;
    }
}
