package br.com.sergio.poo.HerançaInterfacePolimofismo.ex2.dominio;

public class Pessoa {
   private String nome;
    private int idade;

    public Pessoa(String nome, int idade ) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
