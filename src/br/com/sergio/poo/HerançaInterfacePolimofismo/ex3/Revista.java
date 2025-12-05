package br.com.sergio.poo.HerançaInterfacePolimofismo.ex3;

public class Revista extends Midia {
    private int edicao;


    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }


    public void imprime (){
        System.out.printf("Código: " + gerarcodigo() + " | Revista \"" + getTitulo() + "\" - Edição: " + getEdicao());
    }
}
