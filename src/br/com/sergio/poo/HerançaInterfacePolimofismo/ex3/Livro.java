package br.com.sergio.poo.HerançaInterfacePolimofismo.ex3;

public class Livro extends Midia {
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void imprime(){
        System.out.println("Código: " + gerarcodigo() + " | Livro: \"" + getTitulo() + "\" - Autor: " + getAutor());
    }



}
