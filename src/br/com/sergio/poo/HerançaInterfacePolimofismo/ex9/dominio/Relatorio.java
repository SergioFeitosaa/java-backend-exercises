package br.com.sergio.poo.HerançaInterfacePolimofismo.ex9.dominio;

public class Relatorio implements Imprimivel{

    private String titulo;
    private String conteudo;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.printf("Título: %s \nConteúdo: %s",titulo,conteudo);
    }
}
