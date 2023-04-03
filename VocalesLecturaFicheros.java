import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VocalesLecturaDeFicherosTest {

    @ParameterizedTest
    @CsvFileSource(resources = "data.txt")
    void additionTest(String a, int b ) {
        int resultadoActual = Vocales.contarVocales(a);
        assertEquals(b, resultadoActual);
    }
}