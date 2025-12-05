package br.com.sergio.poo.HerançaInterfacePolimofismo.ex2.dominio;

public class Aluno extends Pessoa{
    double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public void imprime (){
        System.out.printf("Aluno: %s - Idade: %d - Nota: %.2f\n", getNome(), getIdade(),nota);
    }
}
