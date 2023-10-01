package questao4;

/*Crie um main() para “mocar” os dados e testar os objetos das classes. Exemplo:
• O Fabricante celular A possui todos os recursos comuns aos celulares, porém não
tem TV. O seu valor é R$ 6800.00
• O Fabricante celular B possui todos os recursos comuns aos celulares, porém não
tem rádio. O seu valor é R$ 5200,00.*/

public class Main {
    public static void main(String[] args) {

        ModeloCelular Iphone = new CelularFabricanteA();
        ModeloCelular Samsung = new CelularFabricanteB();

        System.out.println("Celular Fabricante A:");
        System.out.println("Preço: R$" + Iphone.getPreco());
        Iphone.ligar();
        Iphone.usarRadio(true);
        Iphone.enviarMensagem(true);
        Iphone.assistirTV(false);

        System.out.println("\nCelular Fabricante B:");
        System.out.println("Preço: R$" + Samsung.getPreco());
        Samsung.ligar();
        Samsung.usarRadio(false);
        Samsung.acessarInternet(true);
        Samsung.enviarEmail(true);

    }
}
