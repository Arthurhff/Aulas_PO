package questao2;

public class Funcionario extends Pessoa {
    private String departamento;
    private double salario;
    private String dataEntradaBanco;
    private String rg;
    private boolean estaNaEmpresa;

    public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntradaBanco, String rg, boolean estaNaEmpresa) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntradaBanco = dataEntradaBanco;
        this.rg = rg;
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntradaBanco() {
        return dataEntradaBanco;
    }

    public void setDataEntradaBanco(String dataEntradaBanco) {
        this.dataEntradaBanco = dataEntradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public void bonificar(double aumento) {
        salario += aumento;
    }

    public void demitir() {
        estaNaEmpresa = false;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Data de entrada no banco: " + dataEntradaBanco);
        System.out.println("RG: " + rg);
        System.out.println("Está na empresa? " + estaNaEmpresa);
    }
}

