//Faça um programa que leia a placa de um carro e o ano de fabricação. Em seguida,
//validar a situação do carro:

import java.util.Scanner;
public class Carro {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String placa;
        int ano;

        System.out.println("Digite a placa: ");
        placa = ler.next();
        System.out.println("Digite o ano:");
        ano = ler.nextInt();

        if (ano <= 2010)
            System.out.println("Carro velho");
        else if (ano <= 2022)
            System.out.println("Carro seminovo");
        else if (ano == 2023)
            System.out.println("Carro novo");
        else
            System.out.println("Inválido");
        //o 'length' sempre retorna o tamanho da string no loop, não precisa ser definido
        placa = placa.toUpperCase();
        for (int i = 0;i<placa.length();i++){
            if (placa.charAt(i) == 'A' || placa.charAt(i) == 'E' || placa.charAt(i) == 'I' || placa.charAt(i) == 'O' || placa.charAt(i) == 'U')
              placa = placa.replace(placa.charAt(i),'*');
             //placa.replace permite trocar a string por outra, substitiu origem "placa.charAt(i)" por origem "*"
        }
        System.out.println("Placa alterada." + placa);
    }
}