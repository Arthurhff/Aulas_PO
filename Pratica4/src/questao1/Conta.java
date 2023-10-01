package questao1;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Conta {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void imprimeExtrato() {
        System.out.println("*** Extrato da Conta ***");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy " + "HH:mm:ss");
        Date date = new Date();

        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + sdf.format(date));

    }
}
