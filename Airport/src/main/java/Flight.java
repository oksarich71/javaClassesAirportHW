public class Flight {
    private String destination;
    private int flightNumber;
    private Plane plane;
    private int price;

    public Flight(String destination, int flightNumber, Plane plane, int price){
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.plane = plane;
        this.price = price;
    }

    public int getFlightPrice(){
        return this.price;
    }



}
