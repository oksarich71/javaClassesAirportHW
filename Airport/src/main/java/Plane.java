import java.util.ArrayList;


public class Plane {
    private String airline;
    private Type type;
    private int capacity;
    private ArrayList<Person> passengers;

    public Plane(String airline, Type type, int capacity) {

        this.airline = airline;
        this.type = type;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public Type getType(){
        return this.type;
    }

    public void addPassenger(Person person){
        this.passengers.add(person);
    }

    public int countPassengers() {
        return this.passengers.size();
    }

    public void addPassengerIfNotTooFull(Person person){
        if (this.countPassengers() < this.capacity) {
            this.passengers.add(person);
        }else{
            System.out.println("Sorry no more tickets");
        }
    }
}
