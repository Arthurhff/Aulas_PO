
// *****classe estoque****
// *****variaveis******
// -id int
// -produto String
// -estoque int
// -preco double
// *****Metodos*****
// cadastrar (construtor, cria automatico) alt + insert = atalho
// baixaestoque
// acrescimoestoque
// totalestoque
// consultarestoque

//******************************************

package armazem;
public class Estoque {

    private int id;
    private String produto;
    private int estoque;
    private double  preco;

    // aqui criei um contrutor com alt + insert para definir quais
    // variaveis eu quero utilizar pro metodo cadastrar
    public Estoque(int id, String produto, int estoque, double preco) {
        this.id = id;
        this.produto = produto;
        this.estoque = estoque;
        this.preco = preco;
        //modificador que faz referencia aos atributos
    }
    public void Acrescimo(int qtde){
        this.estoque =estoque +qtde;
    }
    public void Baixa(int qtde){
        if(qtde<=estoque)
        this.estoque = estoque - qtde;
    }
    public double TotalEstoque(){
        return estoque*preco;
    }
    public String ConsultaEstoque(){
        return "Produto: " + produto+ "\nEstoque: " + estoque + "\nPreço: " + preco;
    }

}
