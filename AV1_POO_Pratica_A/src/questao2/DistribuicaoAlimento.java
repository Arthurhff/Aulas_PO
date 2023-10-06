package questao2;

public class DistribuicaoAlimento extends Projeto {

    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String descAlimento, int qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = this.descAlimento;
        this.qtde = this.qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto() {
        if(getDataFim() == null)
            return true;
        return false;
    }
    @Override
    String imprimeProjeto(){
        return "Nome do Projeto: " + getNomeProjeto() + "\nDescrição: " + getDescricao(); }


}