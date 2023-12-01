import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criar ArrayList de Produto e inserir 5 produtos distintos
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Categoria categoria1 = new Categoria("Ferramentas");
        Categoria categoria2 = new Categoria("Materiais de Construção");

        Produto produto1 = new Produto("Furadeira", "Furadeira elétrica potente", 150.0, 20, categoria1);
        Produto produto2 = new Produto("Tinta", "Tinta acrílica para parede", 50.0, 30, categoria2);
        Produto produto3 = new Produto("Martelo", "Martelo de construção resistente", 25.0, 40, categoria1);
        Produto produto4 = new Produto("Cimento", "Saco de cimento 50kg", 20.0, 50, categoria2);
        Produto produto5 = new Produto("Serra Circular", "Serra circular para madeira", 120.0, 15, categoria1);
        

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        listaProdutos.add(produto5);

        // Criar ArrayList de Pedido e inserir 2 pedidos com 3 itens cada
        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        // Pedido 1
        Pedido pedido1 = new Pedido(1, new Date(), 0.0, 1);

        PedidoItem item1Pedido1 = new PedidoItem("Furadeira", 150.0, 2);
        PedidoItem item2Pedido1 = new PedidoItem("Tinta", 50.0, 1);

        // Verificar se os produtos existem antes de adicionar ao pedido
        if (produtoExiste(item1Pedido1, listaProdutos) && produtoExiste(item2Pedido1, listaProdutos)) {
            pedido1.inserirItensPedido(item1Pedido1);
            pedido1.inserirItensPedido(item2Pedido1);

            // Atualizar o estoque após a inserção dos itens
            for (PedidoItem item : pedido1.getItensPedido()) {
                Produto produto = buscarProduto(item.getNomeItem(), listaProdutos);
                if (produto != null) {
                    produto.setEstoqueProduto(produto.getEstoqueProduto() - item.getQuantidade());
                }
            }

            // Atualizar o status do pedido e calcular o total a pagar
            pedido1.alterarStatus(2);
            pedido1.calcularTotalPagar();

            listaPedidos.add(pedido1);
        }

        // Pedido 2
        Pedido pedido2 = new Pedido(2, new Date(), 0.0, 1);

        PedidoItem item1Pedido2 = new PedidoItem("Martelo", 25.0, 3);
        PedidoItem item2Pedido2 = new PedidoItem("Cimento", 20.0, 2);

        // Verificar se os produtos existem antes de adicionar ao pedido
        if (produtoExiste(item1Pedido2, listaProdutos) && produtoExiste(item2Pedido2, listaProdutos)) {
            pedido2.inserirItensPedido(item1Pedido2);
            pedido2.inserirItensPedido(item2Pedido2);

            // Atualizar o estoque após a inserção dos itens
            for (PedidoItem item : pedido2.getItensPedido()) {
                Produto produto = buscarProduto(item.getNomeItem(), listaProdutos);
                if (produto != null) {
                    produto.setEstoqueProduto(produto.getEstoqueProduto() - item.getQuantidade());
                }
            }

            // Atualizar o status do pedido e calcular o total a pagar
            pedido2.alterarStatus(2);
            pedido2.calcularTotalPagar();

            listaPedidos.add(pedido2);
        }

        // Exibir resultados
        System.out.println("Lista de Produtos de Construção:");
        for (Produto produto : listaProdutos) {
            System.out.println("Nome: " + produto.getNomeProduto() +
                    ", Estoque: " + produto.getEstoqueProduto());
        }

        System.out.println("\nLista de Pedidos:");
        for (Pedido pedido : listaPedidos) {
            System.out.println("Número do Pedido: " + pedido.getNumeroPedido() +
                    ", Status: " + pedido.getStatusPedido() +
                    ", Valor Total: " + pedido.getPrecoTotal());
        }
    }

    // Método para verificar se um produto existe na lista
    private static boolean produtoExiste(PedidoItem item, ArrayList<Produto> produtos) {
        for (Produto produto : produtos) {
            if (produto.getNomeProduto().equals(item.getNomeItem())) {
                return true;
            }
        }
        System.out.println("Produto não encontrado: " + item.getNomeItem());
        return false;
    }

    // Método para buscar um produto na lista
    private static Produto buscarProduto(String nome, ArrayList<Produto> produtos) {
        for (Produto produto : produtos) {
            if (produto.getNomeProduto().equals(nome)) {
                return produto;
            }
        }
        return null;
    }
}
