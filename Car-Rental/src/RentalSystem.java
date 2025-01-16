import payment.PaymentProcessor;
import payment.emiPaymentProcessor;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RentalSystem {
    private final Map<String, Car> cars;
    private final Map<String, Reservation> reservations;
    private final PaymentProcessor paymentProcessor;
    private static RentalSystem instance;

    private RentalSystem(){
        cars=new ConcurrentHashMap<>();
        reservations=new ConcurrentHashMap<>();
        paymentProcessor=new emiPaymentProcessor();
    }

    public static  synchronized RentalSystem getInstance(){
        if(instance == null){
            instance=new RentalSystem();
        }
        return instance;
    }
    public void addCar(Car car){
        cars.put(car.getNum(),car);
    }

    public void removeCar(String carNum){
        cars.remove(carNum);
    }

    public List<Car> searchCars(String maker,String name, ){}

    private boolean isCarAvailable(){}


}
