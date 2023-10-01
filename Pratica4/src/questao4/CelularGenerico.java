package questao4;

abstract class CelularGenerico implements ModeloCelular {
    private double preco;

    public CelularGenerico(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void controleVolume(boolean acao);

    void verificarSistemaDeArquivo(boolean acao) {

    }
}
