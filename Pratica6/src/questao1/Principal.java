package questao1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //dados da Rede Social
        System.out.println("Digite a data de criação da Rede Social:");
        String dataCriacao = scanner.nextLine();
        System.out.println("Digite o nome do usuário:");
        String nomeUsuario = scanner.nextLine();
        System.out.println("Digite a data de nascimento do usuário:");
        String dataNascimento = scanner.nextLine();
        System.out.println("Digite a senha do usuário:");
        String senha = scanner.nextLine();

        //criacao da rede social
        RedeSocial redeSocial = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

        //criacao das publicações
        System.out.println("Digite a data da primeira publicação:");
        String dataPublicacao1 = scanner.nextLine();
        System.out.println("Digite o texto da primeira publicação:");
        String textoPublicacao1 = scanner.nextLine();
        System.out.println("Digite o link da mídia da primeira publicação:");
        String linkMidia1 = scanner.nextLine();
        Publicacao publicacao1 = new Publicacao(dataPublicacao1, textoPublicacao1, linkMidia1);

        System.out.println("Digite a data da segunda publicação:");
        String dataPublicacao2 = scanner.nextLine();
        System.out.println("Digite o texto da segunda publicação:");
        String textoPublicacao2 = scanner.nextLine();
        System.out.println("Digite o link da mídia da segunda publicação:");
        String linkMidia2 = scanner.nextLine();
        Publicacao publicacao2 = new Publicacao(dataPublicacao2, textoPublicacao2, linkMidia2);

        //inserindo publicações na rede Social
        redeSocial.inserePublicacao(publicacao1);
        redeSocial.inserePublicacao(publicacao2);

        //print no terminal das publicações
        redeSocial.imprimePublicacoes();

        scanner.close();
    }
}