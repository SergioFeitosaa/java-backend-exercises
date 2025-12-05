package br.com.sergio.poo.HerançaInterfacePolimofismo.ex4.dominio;

public class Push extends Notificacao{
    protected String conteudo;

    public Push(String destinatario, String mensagem, String conteudo) {
        super(destinatario, mensagem);
        this.conteudo = conteudo;
    }

    @Override
    public void enviar() {
        System.out.printf("\nEnviado Push para: %s\nTítulo: %s\nConteúdo: %s\n",destinatario, mensagem,conteudo);
    }
}
