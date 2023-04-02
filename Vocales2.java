public class Vocales2 {
    public static String sinVocales(String cadena) {
        String cadenaSinVocales = "";
        char letra;
        for (int i = 0; i < cadena.length(); i++) {
            letra = cadena.charAt(i);
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u' && letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U') {
                cadenaSinVocales += letra;
            }
        }
        return cadenaSinVocales;
    }
}
