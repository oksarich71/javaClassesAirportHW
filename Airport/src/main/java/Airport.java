import java.util.ArrayList;

public class Airport {
    private AirportCode code;
    private int till;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;

    public Airport(AirportCode code) {
        this.code = code;
        this.till = 0;
        this.hangars = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public int countFlights(){
        return this.flights.size();
    }

    public int getTill(){
        return this.till;
    }

    public void createFlight(){
        Plane plane = hangars.get(0).removePlane();
        Flight flight = new Flight("Bangkok", 654, plane, 500);
        this.flights.add(flight);
    }

    public void addHangar(Hangar hangar){
        this.hangars.add(hangar);
    }
    public void sellTicket(Flight flight){
        int price = flight.getFlightPrice();
        this.till += price;
    }




}
