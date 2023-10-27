package questao3;
import java.util.ArrayList;

public class Edicao {
    private int numero;
    private int volume;
    private String dataEdicao;
    private int tiragem;

    private ArrayList<Edicao> artigos;

    public Edicao(int numero, int volume, String dataEdicao, int tiragem) {
        this.numero = numero;
        this.volume = volume;
        this.dataEdicao = dataEdicao;
        this.tiragem = tiragem;
        this.artigos = artigos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public int getTiragem() {
        return tiragem;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public ArrayList<Edicao> getArtigos() {
        return artigos;
    }

    public void setArtigos(ArrayList<Edicao> artigos) {
        this.artigos = artigos;
    }

    public void adicionarArtigo(Edicao artigo){
        artigos.add(artigo);
    }

    public void adicionaArtigo(Artigo artigo) {

    }
}
