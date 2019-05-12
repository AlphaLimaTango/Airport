import java.util.ArrayList;

public class Hangar {

    private ArrayList<Plane> planes;

    public Hangar() {
        this.planes = new ArrayList<>();
    }

    public int getPlaneCount() {
        return this.planes.size();
    }
}
