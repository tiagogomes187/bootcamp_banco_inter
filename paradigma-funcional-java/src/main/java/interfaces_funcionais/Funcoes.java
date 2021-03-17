package interfaces_funcionais;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornoNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroCalcularODobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornoNomeAoContrario.apply("Tiago"));
        System.out.println(converterStringParaInteiroCalcularODobro.apply("20"));
    }
}
