package interfaces_funcionais;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornoNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();

        //PAREI NO TEMPO: 07:00 - FUI DORMIR
        System.out.println(retornoNomeAoContrario.apply("Tiago"));
    }
}
