package questao2;

public class Main {
    public static void main(String[] args) {

        FPadrao fp = new FPadrao(1, "Arthur", 1000);
        System.out.println(fp.toString());

        FComissionado fc = new FComissionado(2, "Pedro", 1500, 2, 10000);
        System.out.println(fc.toString());

        FProdutividade fprod = new FProdutividade(3, "Talita", 1200, 0.50, 100);
        System.out.println(fprod.toString());

    }
}
