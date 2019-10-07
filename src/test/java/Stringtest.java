
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class Stringtest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Initialize connection to database");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Close connection to database");
    }

    @BeforeEach
    void beforeEach(TestInfo info){
        System.out.println("Initialize Test data for:"+info.getDisplayName());
    }

    @AfterEach
    void afterEach(){
        System.out.println("CLEAN UP");
    }

    @Test
     void whateveryouwant() {
        int actualLength = "ABCD".length();
        int expectedLength = 4;
        assertEquals(expectedLength, actualLength);
    }

    @Test
     void toUpperCase(){
        String str = "abcd";
        String result = str.toUpperCase();
        assertNotNull(result);
        assertEquals("ABCD", result);
    }

    @Test
     void contains_basic() {
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
