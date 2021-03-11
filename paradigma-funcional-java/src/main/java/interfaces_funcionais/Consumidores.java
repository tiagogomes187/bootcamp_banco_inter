package interfaces_funcionais;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        // - Apenas
        // - UTILIZAR o parametro da forma que ele foi recebid;

        Consumer<String> imprimeUmaFrase = frase -> System.out.println(frase);
        imprimeUmaFrase.accept("Hello World!");
    }
}
