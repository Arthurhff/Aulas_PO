import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoItem {
    private String nomeItem;
    private double precoUnitario;
    private int quantidade;
    private double subtotal;

    public PedidoItem(String nomeItem, double precoUnitario, int quantidade) {
        this.nomeItem = nomeItem;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.subtotal = precoUnitario * quantidade;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        calcularSubtotal();
    }

    public double getSubtotal() {
        return subtotal;
    }

    private void calcularSubtotal() {
        this.subtotal = this.precoUnitario * this.quantidade;
    }

    // Método para atualizar o estoque do item
    public void atualizaEstoqueItem() {
        // Implemente a lógica de atualização do estoque do item aqui
        System.out.println("Estoque do item atualizado para: " + this.quantidade);
    }
}
