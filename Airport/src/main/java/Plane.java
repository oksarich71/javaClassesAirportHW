import java.util.ArrayList;


public class Plane {
    private String airline;
    private Type type;
    private ArrayList<Person> passengers;

    public Plane(String airline, Type type) {

        this.airline = airline;
        this.type = type;
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
}