package lambdas;

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
    }
}
@FunctionalInterface
interface Funcao{
    String gerar(String valor);
}
