import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private List<PedidoItem> itensPedido;

    // Construtor (método inserirPedido)
    public Pedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
        this.itensPedido = new ArrayList<>();
    }

    // Método alterarStatus
    public void alterarStatus(int novoStatus) {
        this.statusPedido = novoStatus;
    }

    // Método consultarPedido
    public boolean consultarPedido(Pedido pedido) {
        return this.numeroPedido == pedido.getNumeroPedido();
    }

    // Método inserirItensPedido
    public void inserirItensPedido(PedidoItem pedidoItem) {
        this.itensPedido.add(pedidoItem);
        calcularTotalPagar();
    }

    // Método excluirItensPedido
    public void excluirItensPedido(PedidoItem pedidoItem) {
        this.itensPedido.remove(pedidoItem);
        calcularTotalPagar();
    }

    // Método calcularTotalPagar
    public double calcularTotalPagar() {
        double total = 0.0;
        for (PedidoItem item : itensPedido) {
            total += item.getSubtotal();
        }
        this.precoTotal = total;
        return total;
    }

    public List<PedidoItem> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<PedidoItem> itensPedido) {
        this.itensPedido = itensPedido;
    }

    // Outros métodos getters e setters
    // ...

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }
}