import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VocalesParametrizedTest {

    @DisplayName("Dada una cadena de texto...")
    @ParameterizedTest(name = "Dada una cadena de texto {0}, el numero de vocales es {1}")
    @CsvSource(value = {
            "Hola mundo             |   4",
            "Esto Es una cadenA     |   8",
            "Java mola mogollOn     |   7",
            "4h0r4 s0n num3r0s      |   1",
            "Cadena S1n Vocales     |   6"
    }, delimiter = '|')
    void additionTest(String a, int b ) {
        int resultadoActual = Vocales.contarVocales(a);
        assertEquals(b, resultadoActual);
    }
}