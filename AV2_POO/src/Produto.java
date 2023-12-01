public class Produto {
    private String nomeProduto;
    private String descProduto;
    private double precoAtual;
    private int estoqueProduto;
    private Categoria categoria;

    // Construtor (método inserirProduto)
    public Produto(String nomeProduto, String descProduto, double precoAtual, int estoqueProduto, Categoria categoria) {
        this.nomeProduto = nomeProduto;
        this.descProduto = descProduto;
        this.precoAtual = precoAtual;
        this.estoqueProduto = estoqueProduto;
        this.categoria = categoria;
    }

    // Getters e Setters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public void setPrecoAtual(double precoAtual) {
        this.precoAtual = precoAtual;
    }

    public int getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(int estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Método buscarProduto
    public boolean buscarProduto(Produto produto) {
        // Comparação com o atributo nomeProduto
        return this.nomeProduto.equals(produto.getNomeProduto());
    }
}
