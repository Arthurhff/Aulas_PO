package questao2;

public class Empresa {
    private String nome;
    private String cnpj;
    private int qtdeDeFuncionarios;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int qtdeDeFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeDeFuncionarios = qtdeDeFuncionarios;
        this.funcionarios = new Funcionario[100];
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (qtdeDeFuncionarios < 100) {
            funcionarios[qtdeDeFuncionarios] = funcionario;
            qtdeDeFuncionarios++;
            System.out.println("Funcionário adicionado com sucesso!");
        } else {
            System.out.println("Não foi possível adicionar o funcionário. Limite máximo de funcionários atingido.");
        }
    }

    public void mostrarFuncionarios() {
        for (int i = 0; i < qtdeDeFuncionarios; i++) {
            funcionarios[i].mostrarDados();
            System.out.println();
        }
    }
}
