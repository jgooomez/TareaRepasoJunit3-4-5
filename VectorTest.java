import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    @Test
    void testReverso1() {
        int []v = {1,2,3,4,5,6};
        int[] resultadActual = Vector.Reverso(v);
        int[] resultadoEsperado = {6,5,4,3,2,1};
        assertEquals(Arrays.toString(resultadoEsperado), Arrays.toString(resultadActual));
    }

    @Test
    void testReverso2() {
        int []v = {7,6,221,5,12,10};
        int[] resultadActual = Vector.Reverso(v);
        int[] resultadoEsperado = {10,12,5,221,6,7};
        assertEquals(Arrays.toString(resultadoEsperado), Arrays.toString(resultadActual));
    }

    @Test
    void testReverso3() {
        int []v = {5};
        int[] resultadActual = Vector.Reverso(v);
        int[] resultadoEsperado = {5};
        assertEquals(Arrays.toString(resultadoEsperado), Arrays.toString(resultadActual));
    }

    @Test
    void testReverso4() {
        int []v = {20,10,5};
        int[] resultadActual = Vector.Reverso(v);
        int[] resultadoEsperado = {5,10,20};
        assertEquals(Arrays.toString(resultadoEsperado), Arrays.toString(resultadActual));
    }
}