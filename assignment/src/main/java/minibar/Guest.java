package minibar;

/**
 * This class represent a typical guest of a pub. He / she want drink beer and
 * can be drunken.
 *
 * @author Pia Erbrath
 */
public class Guest {
    private double fill;
    private double capacity;

    public Guest(double capacity) {
        this.fill = 0;
        this.capacity = capacity;
    }
    
    /**
     * *
     * Drinks a beer, optionally get drunk, Hickup.
     *
     * @param beer to consume
     * @return self, I am still on my feet.
     * @throws DrunkenException when overfilled.
     */
    public Guest drink( Beer beer ) throws DrunkenException {
        if (beer.getVolume() + this.fill >= this.capacity) {
            throw new DrunkenException("You will get drunk. Stop!");
        }
        return new Guest(this.fill + beer.getVolume());
    }
}
