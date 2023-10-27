package questao3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crie um ArrayList de 10 objetos da classe Artigos.
        ArrayList<Artigo> artigos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            artigos.add(new Artigo("Titulo" + i, "Resumo" + i, "Autores" + i));
        }

        // Crie um objeto do tipo Edição, adicione todos os artigos.
        Edicao edicao = new Edicao(1, 1, "01/01/2023", 1000);
        for (Artigo artigo : artigos) {
            edicao.adicionaArtigo(artigo);
        }

        // Crie uma Revista Científica e adicione a Edição.
        RevistaCientifica revistaCientifica = new RevistaCientifica("Revista", 123456789L, "Mensal");
        revistaCientifica.adicionaEdicao(edicao);
    }
}