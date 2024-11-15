package flights;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    private List<Flight> flights;

    public FlightSearch(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> searchFlights(String src, String dest, LocalDate time){
        return flights.stream()
                .filter(flight -> flight.getSource().equalsIgnoreCase(src)
                        && flight.getDestination().equalsIgnoreCase(dest)
                        && flight.getEnd().toLocalDate().equals(time))
                .collect(Collectors.toList());
    }
}
