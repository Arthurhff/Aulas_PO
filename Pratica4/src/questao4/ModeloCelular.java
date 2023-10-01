package questao4;

 /*A interface de uso de um celular é composta por recursos como ligar e desligar o
                celular, câmera, acessa ao fone de ouvido e controle de volume.
        Todos os recursos são do tipo SIM ou Não (verdadeiro ou Falso).*/

public interface ModeloCelular  {

    void ligar();
    void desligar ();
    void ligarDesligar (boolean acao);
    void celular (boolean acao);
    void acessarFone(boolean acao);
    void controlarVolume(boolean acao);

    void enviarMensagem(boolean acao);
    void acessarInternet(boolean acao);
    void enviarEmail(boolean acao);
    void usarRadio(boolean acao);
    void assistirTV(boolean acao);
    void veririficarSistemaDeArquivos(boolean acao);

    double getPreco();
}
