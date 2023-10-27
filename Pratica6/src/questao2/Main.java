package questao2;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = new Funcionario("João", "joao@email.com",
                "(11) 99999-9999", "Vendas",
                2500.00, "01/01/2022",
                "123456789", true);

        funcionarios[1] = new Funcionario("Maria", "maria@email.com",
                "(11) 88888-8888", "RH",
                3000.00, "01/01/2021",
                "987654321", true);

        funcionarios[2] = new Funcionario("Pedro", "pedro@email.com",
                "(11) 77777-7777", "TI",
                4000.00, "01/01/2023",
                "456789123", true);

        funcionarios[3] = new Funcionario("Ana", "ana@email.com",
                "(11) 66666-6666", "Contabilidade",
                3500.00, "01/01/2020",
                "789123456", true);

        funcionarios[4] = new Funcionario("Lucas", "lucas@email.com",
                "(11) 55555-5555", "Marketing",
                2800.00, "01/01/2019",
                "321654987", true);

        for (int i = 0; i < 5; i++) {
            funcionarios[i].mostrarDados();
            System.out.println();
        }

        Empresa empresa = new Empresa("Minha Empresa", "12345678901234", 0);

        for (int i = 0; i < 5; i++) {
            empresa.adicionarFuncionario(funcionarios[i]);
            System.out.println();
        }

        empresa.mostrarFuncionarios();
    }
}

