package data.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReversalTest {
    @Test
    public void reverseString_whenGivenAString_shouldReturnTheReverse(){
        /*  reverseString('yoyo mastery')
    //should return: 'yretsam oyoy'

     */
        StringReversal stringReversal = new StringReversal();
        String expected ="yretsam oyoy";
        String got = stringReversal.reverseStringIterativeBuilder("yoyo mastery");
        assertEquals(expected,got);
    }

    @Test
    public void reverseString_whenGivenEmpty_ReturnsEmptyString(){
        /*  reverseString('yoyo mastery')
    //should return: 'yretsam oyoy'

     */
        StringReversal stringReversal = new StringReversal();
        String expected ="";
        String got = stringReversal.reverseStringIterativeBuilder(null);
        assertEquals(expected,got);
    }

    @Test
    public void reverseString_Recursive(){

        StringReversal stringReversal = new StringReversal();
        String expected ="yretsam oyoy";
        String got = stringReversal.reverseStringRecursive("yoyo mastery",new StringBuilder());
        assertEquals(expected,got);
    }

    @Test
    public void reverseString_RecursiveAlt(){

        StringReversal stringReversal = new StringReversal();
        String expected ="yretsam oyoy";
        String got = stringReversal.reverseStringRecursive("yoyo mastery");
        assertEquals(expected,got);
    }
}