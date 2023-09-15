package armazem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int id, estoque;
        String produto;
        double preco;
        System.out.println("Id: ");
        id=ler.nextInt();
        System.out.println("Nome do Produto: ");
        produto=ler.nextLine();
        produto=ler.nextLine();
        System.out.println("Estoque inicial: ");
        estoque = ler.nextInt();
        System.out.println("Preço: ");
        preco = ler.nextDouble();

        Estoque e1 = new Estoque(id, produto, estoque, preco);

        System.out.println("Digite a qtde para acrescentar: ");
        int qtde = ler.nextInt();
        e1.Acrescimo(qtde);

        System.out.println("Digite a qtde para baixar: ");
        qtde = ler.nextInt();
        e1.Baixa(qtde);

        System.out.println(e1.ConsultaEstoque());

        
        //Exemplo abaixo é um sistema onde os valores estão 'mocados' pra cada objeto
        //e1 (e2,e3...) é um Objeto de da classe Estoque
        /*Estoque e1 =new Estoque(1,"Arroz",10,5);
        Estoque e2 =new Estoque(2,"Feijão",10,5.65);
        Estoque e3 =new Estoque(3,"Açucar",10,5);

        e1.Acrescimo(100);
        System.out.println(e1.ConsultaEstoque());
        e2.Baixa(7);
        System.out.println(e2.ConsultaEstoque());
        System.out.println(e3.ConsultaEstoque());
        System.out.println(e3.TotalEstoque());*/

    }
}