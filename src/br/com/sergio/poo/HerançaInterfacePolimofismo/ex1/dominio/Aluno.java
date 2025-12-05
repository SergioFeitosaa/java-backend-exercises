package br.com.sergio.poo.HerançaInterfacePolimofismo.ex1.dominio;

public class Aluno {
    protected String nome;
    protected String tipo;

    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void identificador(){
        System.out.printf("Aluno: %s - Tipo; %s\n", nome,tipo);
    }
}
