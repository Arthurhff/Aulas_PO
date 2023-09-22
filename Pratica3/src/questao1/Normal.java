package questao1;

public class Normal extends Ingresso {
    public Normal(double valorIngresso) {
        super(valorIngresso);
    }

    public void imprimeIngresso() {
        System.out.println("Ingresso normal - valor: "
                + getValorIngresso());

    }
}
