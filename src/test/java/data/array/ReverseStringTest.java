package data.array;


import data.array.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ReverseStringTest {

    @Test
    public void inputStringIsReversed() {
        final String input = "Steve is a great coder!";
        final String want = "!redoc taerg a si evetS";

        ReverseString rs = new ReverseString();

        String got = rs.reverseIncrement(input);
        assertEquals(want, got);

        got = rs.reverseDecrement(input);
        assertEquals(want, got);

        got = rs.reverseIncrement("");
        assertEquals("", got);

        got = rs.reverseIncrement(null);
        assertEquals(null, got);

    }




}