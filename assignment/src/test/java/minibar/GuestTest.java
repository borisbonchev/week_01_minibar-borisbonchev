package minibar;

import static org.assertj.core.api.Assertions.*;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Pieter van den Hombergh {@code p.vandehombergh@gmail.com}
 */
public class GuestTest {
    @Test
    public void guestDrinkingTest() {
        Guest guest = new Guest(3.0D);
        Beer beer = new Beer(2.9D);
        ThrowingCallable code = () -> {
            guest.drink(beer);
        };
        
        assertThatCode(code).doesNotThrowAnyException();
    }
    
    @Test
    public void guestDrunkTest() {
        Guest guest = new Guest(3.0D);
        Beer beer = new Beer(3.1D);
        ThrowingCallable code = () -> {
            guest.drink(beer);
        };
        
        assertThatThrownBy(code).isExactlyInstanceOf( 
                DrunkenException.class);
    }
}
