import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private final String reservationId;
    private final Customer customer;
    private final Car car;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final int totalPrice;

    public Reservation(String reservationId, Customer customer, Car car, LocalDate startDate, LocalDate endDate, int totalPrice) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = calculatePrice();
    }

    private int calculatePrice(){
        int days= (int) (ChronoUnit.DAYS.between(startDate,endDate)+1);
        return days* car.getPrice();
    }

    public String getReservationId() {
        return reservationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
