package questao2;

public class ContaCorrente extends Conta {
    private double saldo;
    private double taxaOperacao = 0.45;
    @Override

    public void depositar (double valor){
        this.saldo += valor - taxaOperacao;
    }
    @Override

    public double getSaldo(){
        return this.saldo;
    }
    @Override

    public void sacar(double valor){
        this.saldo =- valor + taxaOperacao;
    }

}
