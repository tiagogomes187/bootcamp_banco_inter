package digital.innovation.one.core;

import digital.innovation.one.utils.Calculadora;

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma: " + calculadora.sum(1,2));
        System.out.println("Multiplicação: " + calculadora.mult(2,4));
    }
}
