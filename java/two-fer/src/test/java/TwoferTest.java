import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoferTest {

    private Twofer twofer;

    @Before
    public void setup() {
        twofer = new Twofer();
    }

    @Test
    public void noNameGiven() {
        String input = null;
        String expected = "One for you, one for me.";

        assertEquals(expected, twofer.twofer(input));
    }


    @Test
    public void aNameGiven() {
        String input = "Alice";
        String expected = "One for Alice, one for me.";

        assertEquals(expected, twofer.twofer(input));
    }

    @Test
    public void anotherNameGiven() {
        String input = "Bob";
        String expected = "One for Bob, one for me.";

        assertEquals(expected, twofer.twofer(input));
    }

    @Test
    public void requiredNameGiven(){
        String input = "Zaphod";
        String expected = "One for Zaphod, one for me.";

        assertEquals(expected,twofer.twofer(input));
    }

    @Test
    public void anotherEmptyName(){
        String input = "";
        String expected = "One for you, one for me.";

        assertEquals(expected,twofer.twofer(input));
    }
}
