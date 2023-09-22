package questao3;

import javax.swing.*;

public class Veiculo {
    private String placa = "";
    private String ano = "";

    public Veiculo(String placa, String ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getPlaca() {
        return placa;
    }
    public String getAno() {
        return ano;
    }

    public Object exibirDados(){
        JOptionPane.showMessageDialog(null,"Dados do veículo\n\n" + "Placa: " + getPlaca() + "\n" + "Ano: " + getAno());
        //JOptionPane.showMessageDialog(null,"Placa: " + getPlaca());
        //JOptionPane.showMessageDialog(null,"Ano: " + getAno());
        return null;
    }
}
