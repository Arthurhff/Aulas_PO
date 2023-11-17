package pratica_7;

import javax.swing.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {


        int menu= 0;

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(" Ecolha dentre as opções: 1) Adicionar 2) Deletar 3) Consultar"));

            switch (menu) {
                case 1:
                    String id_isbn, nm_titulo;
                    int id_categoria, id_editora;
                    double vl_preco;

                    id_isbn = JOptionPane.showInputDialog("Digite ISBN");
                    nm_titulo = JOptionPane.showInputDialog("Digite titulo");
                    id_categoria = Integer.parseInt(JOptionPane.showInputDialog("Digite codigo da categoria"));
                    id_editora = Integer.parseInt(JOptionPane.showInputDialog("Digite codigo da editora"));
                    vl_preco = Double.parseDouble(JOptionPane.showInputDialog("Digite preço do livro"));

                    Inserir inserir = new Inserir(id_isbn, id_categoria, id_editora, nm_titulo, vl_preco);
                    break;
                case 2:
                    String cod_excluir = JOptionPane.showInputDialog("DELETE");
                    Excluir excluir = new Excluir(cod_excluir);
                    break;
                case 3:
                    Consulta busca = new Consulta();
                    String buscaTitulo = JOptionPane.showInputDialog("Digite Titutlo para buscar");
                    busca.BuscaTitulo(buscaTitulo);
                    break;
            }

        } while (menu != 5);
    }
}