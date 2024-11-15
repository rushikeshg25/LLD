package flights;

import java.time.LocalDateTime;

public class Flight {
    private String flightNumber;
    private String source;
    private String destination;
    private LocalDateTime start;
    private LocalDateTime end;
    private Aircraft aircraft;

    public Flight(String flightNumber, String source, String destination, LocalDateTime start, LocalDateTime end, Aircraft aircraft) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.start = start;
        this.end = end;
        this.aircraft = aircraft;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
}
