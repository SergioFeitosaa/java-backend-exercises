package br.com.sergio.poo.HerançaInterfacePolimofismo.ex4.dominio;

public class Email extends Notificacao {
    protected String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }


    @Override
    public void enviar() {
        System.out.printf("\nEnviado Email para: %s \nAssunto: %s\nCorpo: %s\n", destinatario, assunto, mensagem);
    }
}
