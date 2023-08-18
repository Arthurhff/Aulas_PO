
public class Main {
    public static void main(String[] args) {
        //cria o objeto com nome c1 do tipo da classe ContaCorrente
        ContaCorrente c1 = new ContaCorrente();
        //é definido o valor de cada variavel em ordem do que foi criado na classe referente
        c1.cadastrar(123, "Ana", 789);
        //valor depositado
        c1.depositar(1000);
        System.out.println("Saldo:" + c1.ConsultarSaldo() );
        c1.sacar(200);
        System.out.println("Saldo:" + c1.ConsultarSaldo());
    }

}