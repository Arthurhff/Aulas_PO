package questao3;

public class TrabalhoVoluntario extends Projeto {

    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto(){
        if (duracaoTrabalho > 2)
            return true;
        return false;
    }

    public String imprimeProjeto(){
        System.out.println("Nome: " + getNomeProjeto());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Data inicio: " + getDataInicio());
        System.out.println("Data Fim: " + getDataFim());
        System.out.println("Tipo trabalho: " + getTipoTrabalho());
        System.out.println("Duração trabalho: " + getDuracaoTrabalho());

        return null;
    }
}
