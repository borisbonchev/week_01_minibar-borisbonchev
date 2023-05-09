package minibar;

/**
 * This class represents a beer. A beer will have an id, a size and a ordered
 * time.
 *
 */
public class Beer {
    private double volume;

    public Beer(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
