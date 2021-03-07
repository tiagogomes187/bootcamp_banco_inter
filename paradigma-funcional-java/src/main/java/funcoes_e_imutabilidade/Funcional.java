package funcoes_e_imutabilidade;

import java.util.function.UnaryOperator;

public class Funcional {
    public static void main(String[] args) {
        UnaryOperator<Integer> calcularValorVezes3 = valor -> valor*3;
        //int valor = 10;
        System.out.println("O RESULTADO É :: " + calcularValorVezes3.apply(10));
    }
}
