import java.util.HashMap;
import java.util.Map;

public class HotelManagement {
    private static HotelManagement instance;
    private Map<String,Room> rooms;
    private Map<String,Reservation> reservations;
    private Map<String,Guest> guests;

    private HotelManagement(){
        this.guests=new HashMap<>();
        this.reservations=new HashMap<>();
        this.rooms=new HashMap<>();
    }

    public static HotelManagement getInstance(){
        if(instance==null){
            instance=new HotelManagement();
        }
        return instance;
    }
}
