package questao1;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Encontrar {
    public static void main(String[] args) {

        Usuario usario1 = new Usuario("Arthur", "arthurhff@gmail.com", "senha");
        AchadoPerdido ap = new AchadoPerdido("Livro", "Livro Alugado", "Terror", "Perdido");

        System.out.printf(ap.buscarTitulo());
        System.out.printf(ap.vizualizarDetalhes());

    }
}