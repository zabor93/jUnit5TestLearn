import org.junit.Test;

import static org.junit.Assert.*;

public class Stringtest {

    @Test
    public void whateveryouwant() {
        int actualLength = "ABCD".length();
        int expectedLength = 4;
        assertEquals(expectedLength, actualLength);
    }

    @Test
    public void toUpperCase(){
        String str = "abcd";
        String result = str.toUpperCase();
        assertNotNull(result);
        assertEquals("ABCD", result);
    }

    @Test
    public void contains_basic() {
        String str = "abcdefgh";
        boolean result = str.contains("ijk");
        assertEquals(false, result);
        assertFalse(result);
    }

    @Test
    public void split_basic() {
        String str = "abc def ghi";
        String actualResult[]= str.split(" ");
        String[] expectedResult = new String[]{"abc", "def", "ghi"};
        assertArrayEquals(expectedResult, actualResult);
    }
}
