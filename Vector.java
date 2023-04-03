public class Vector {
    public static int []Reverso(int v[]) {
        int[] arrayInvertido = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            arrayInvertido[v.length - 1 - i] = v[i];
        }
        return arrayInvertido;
    }
}
