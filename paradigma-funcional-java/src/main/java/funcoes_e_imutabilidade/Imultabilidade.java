package funcoes_e_imutabilidade;

import java.util.function.UnaryOperator;

public class Imultabilidade {
    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retornarDodro = v -> v * 2;
        System.out.println(retornarDodro.apply(valor)); // RETORNA O DOBRO DO VALOR
        System.out.println(valor); // VALOR NÃO SERÁ ALTERADO;
    }
}
