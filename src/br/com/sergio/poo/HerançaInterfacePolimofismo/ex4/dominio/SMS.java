package br.com.sergio.poo.HerançaInterfacePolimofismo.ex4.dominio;

public class SMS extends Notificacao {

    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.printf("\nEnviado SMS para: %s\nMensagem: %s \n", destinatario, mensagem);
    }
}
