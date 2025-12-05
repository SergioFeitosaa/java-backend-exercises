package br.com.sergio.poo.HerançaInterfacePolimofismo.ex3;

public class Midia {
    private String Titulo;
    private int anoPublicacao;

    public Midia(String titulo, int anoPublicacao) {
        Titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String gerarcodigo (){
        return "LIB" + getTitulo().substring(0,3) + anoPublicacao;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }


}
