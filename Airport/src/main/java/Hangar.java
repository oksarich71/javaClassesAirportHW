import java.util.ArrayList;

public class Hangar {
    private ArrayList<Plane> planes;

    public Hangar(){
        this.planes = new ArrayList<>();
    }

    public void addPlane(Plane plane){
        this.planes.add(plane);
    }

    public Plane removePlane(){
        return this.planes.remove(0);
    }
}
