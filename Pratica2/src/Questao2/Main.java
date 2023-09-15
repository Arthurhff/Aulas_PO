package Questao2;

import java.util.Scanner;100

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor inicial do Investimento: ");
        double vrInicial = ler.nextDouble();

        System.out.println("Digite a taxa de juros: ");
        double txJuros = ler.nextDouble();

        System.out.println("Digite o numero de meses para o Rendimento: ");
        int numMeses = ler.nextInt();

        Rendimento r1 = new Rendimento(vrInicial, txJuros, numMeses); //cria o obejto r1 com os atributos
        r1.calculoRendimento();

    }
}