import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void testNextSecond1() {
        Time actual = new Time(12,14,15).nextSecond();
        Time esperado = new Time(12,14,16);
        assertEquals(actual, esperado);
    }

    @Test
    void testNextSecond2() {
        Time actual = new Time(12,59,44).nextSecond();
        Time esperado = new Time(12,59,45);
        assertEquals(actual, esperado);
    }

    @Test
    void testNextSecond3() {
        Time actual = new Time(1,9,59).nextSecond();
        Time esperado = new Time(1,10,0);
        assertEquals(actual, esperado);
    }

    @Test
    void testNextSecond4() {
        Time actual = new Time(17,59,59).nextSecond();
        Time esperado = new Time(18,0,0);
        assertEquals(actual, esperado);
    }

    @Test
    void testNextSecond5() {
        Time actual = new Time(23,59,59).nextSecond();
        Time esperado = new Time(0,0,0);
        assertEquals(actual, esperado);
    }
}