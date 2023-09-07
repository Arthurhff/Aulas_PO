package Atv3;

//Criar uma classe Aluno que possui os atributos: nome, matricula, notaAV1, notaAV2,
//notaAE, curso, periodo.
//a) Criar o construtor desta classe que recebe nome, matricula, notaAV1, notaAV2, curso,
//e periodo.

import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private double notaAV1;
    private double notaAV2;
    private double notaAE;
    private String curso;
    private String periodo;

    public Aluno(String nome, String matricula, double notaAV1, double notaAV2, String curso, String periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }

    //b) Criar um método para alterar cada uma das notas. Exemplo: alteraNotaAV1,
    //alteraNotaAV2 e alteraNotaAE.

    public void alteraNotaAV1(double novaNotaAV1) {
        this.notaAV1 = novaNotaAV1;
    }

    public void alteraNotaAV2(double novaNotaAV2) {
        this.notaAV2 = novaNotaAV2;
    }

    public void alteraNotaAE(double novaNotaAE) {
        this.notaAE = novaNotaAE;
    }

    //c) Criar um método para avaliarAluno que deverá seguir a regra abaixo:
    //Se a soma de notaAV1 e notaAV2 for maior ou igual a 60 pontos, o aluno é Aprovado,
    //caso contrário será Recuperação.
    //O método deverá imprimir as situações de Aprovado ou Recuperação
    public void avaliarAluno() {
        double somaNotasAV = notaAV1 + notaAV2;
        if (somaNotasAV >= 60) {
            System.out.println("Aluno " + nome + " está Aprovado.");
        } else {
            System.out.println("Aluno " + nome + " está em Recuperação.");
            avaliarRecuperacao();
        }
    }

    //d) Criar um método para avaliarRecuperação que deverá receber como parâmetro o
    //valor da notaAE. Deverá ser calculado a nota média (notaAV1+ notaAV2 e notaAE). Se o
    //valor total for superior ou igual a 60 pontos, o aluno é Aprovado, caso contrário
    //Reprovado.
    public void avaliarRecuperacao() {
        double mediaNotas = (notaAV1 + notaAV2 + notaAE) / 3;
        if (mediaNotas >= 60) {
            System.out.println("Aluno " + nome + " foi Aprovado na Recuperação.");
        } else {
            System.out.println("Aluno " + nome + " foi Reprovado na Recuperação.");
        }
    }

    //e) Criar no Void main() um objeto com dados solicitados e testes dos métodos
    //implementados na classe: Construtor, avaliarAluno, avaliarRecuperação caso seja
    //necessário. Os demais métodos também podem ser testados.
    //Solicite os dados pelo teclado

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a matrícula: ");
        String matricula = scanner.nextLine();
        System.out.println("Digite a nota da AV1: ");
        double notaAV1 = scanner.nextDouble();
        System.out.println("Digite a nota da AV2: ");
        double notaAV2 = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o curso: ");
        String curso = scanner.nextLine();
        System.out.println("Digite o período: ");
        String periodo = scanner.nextLine();

        Aluno aluno = new Aluno(nome, matricula, notaAV1, notaAV2, curso, periodo);

        System.out.println("Notas do aluno:");
        System.out.println("AV1: " + aluno.notaAV1);
        System.out.println("AV2: " + aluno.notaAV2);

        System.out.println("Digite a nova nota da AV1: ");
        double novaNotaAV1 = scanner.nextDouble();
        aluno.alteraNotaAV1(novaNotaAV1);

        System.out.println("Digite a nova nota da AV2: ");
        double novaNotaAV2 = scanner.nextDouble();
        aluno.alteraNotaAV2(novaNotaAV2);

        System.out.println("Digite a nota da AE: ");
        double notaAE = scanner.nextDouble();
        aluno.alteraNotaAE(notaAE);

        System.out.println("Resultado da Avaliação:");
        aluno.avaliarAluno();

        scanner.close();
    }
}
