import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vocales2Test {

    @Test
    void testSinVocales_HolaMundo() {
        String resultadoActual = Vocales2.sinVocales("Hola Mundo");
        assertEquals("Hl Mnd", resultadoActual);
    }

    @Test
    void testSinVocales_EstoEsUnaCadena() {
        String resultadoActual = Vocales2.sinVocales("Esto Es una cadenA");
        assertEquals("st s n cdn", resultadoActual);
    }

    @Test
    void testSinVocales_JavaMolaMogollon() {
        String resultadoActual = Vocales2.sinVocales("Java mola MogollOn");
        assertEquals("Jv ml Mglln", resultadoActual);
    }

    @Test
    void testSinVocales_CadenaSinVocales() {
        String resultadoActual = Vocales2.sinVocales("Cadena Sin Vocales");
        assertEquals("Cdn Sn Vcls", resultadoActual);
    }

}