package recursividade;

public class FatorialTailCall {
    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }

    private static double fatorialA(double valor) {
        return fatorialComTailCall(valor, 1);
    }

    private static double fatorialComTailCall(double valor, double numero) {
        if( valor == 0 ) {
            return numero;
        }
        return fatorialComTailCall(valor-1, numero*valor);
    }
    // 5 * 4 * 3 * 2 * 1

}
