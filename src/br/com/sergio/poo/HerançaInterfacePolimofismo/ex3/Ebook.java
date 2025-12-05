package br.com.sergio.poo.HerançaInterfacePolimofismo.ex3;

public class Ebook extends Midia {
    private String formato;


    public Ebook(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void imprime (){
        System.out.printf("Código: " + gerarcodigo() + " | Ebook: \"" + getTitulo() + "\" - Formato: " + getFormato());
    }

}
