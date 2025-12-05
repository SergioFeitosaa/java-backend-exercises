package br.com.sergio.poo.HerançaInterfacePolimofismo.ex3;

public class MidiaTest {
    public static void main(String[] args) {
        Livro livro = new Livro("O Guia do mochileiro das Galáxias", 1979, "Douglas Adams");
        Revista revista = new Revista ("National Geographic", 2023, 245);
        Ebook ebook = new Ebook("Clean code", 2008, "PDF");

        livro.imprime();
        revista.imprime();
        ebook.imprime();
    }

}
