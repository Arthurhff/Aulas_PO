package questao2;

public class ContaPoupanca extends ContaCorrente {
    private double saldo;
    private double taxaOperacao;
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