
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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
    @Test
    @DisplayName("When length is null, throw an exception")
    void testExceptionNullPointer() {
        String str = null;
        assertThrows(NullPointerException.class,()->{str.length();});
    }

    @Test
    void length_greater_than_zero(){
        assertTrue("ABCFD".length() > 0);
        assertTrue("ACFD".length() > 0);
        assertTrue("AD".length() > 0);
        assertTrue("A".length() > 0);
        assertTrue("AD".length() > 0);
        assertTrue("AdsdsdsBCFD".length() > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc", "ABCDS", "A"})
    void length_greater_than_zero_using_parameterized_test(String string) {
        assertTrue(string.length() > 0);
    }

    @ParameterizedTest(name = "{0} upper is {1}")
    @CsvSource(value = {"abcd, ABCD","abc, ABC","'',''"})
    void uppercase(String word, String capitalizedword) {
        assertEquals(capitalizedword, word.toUpperCase());
    }

}
