package digital.innovation.one.operacao;

import digital.innovation.one.operacao.internal.DivHelper;
import digital.innovation.one.operacao.internal.MultiHelper;
import digital.innovation.one.operacao.internal.SubHelper;
import digital.innovation.one.operacao.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultiHelper multiHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        multiHelper = new MultiHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }

    public int mult(int a , int b){
        return multiHelper.execute(a, b);
    }

    public int div(int a, int b){
        return divHelper.execute(a, b);
    }
}
