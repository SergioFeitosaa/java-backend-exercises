package br.com.sergio.poo.HerançaInterfacePolimofismo.ex2.dominio;

public class Docente extends Pessoa {
    String disciplina;

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void imprime (){
        System.out.printf("Aluno: %s - Idade: %d - Disciplina: %s\n", getNome(),getIdade(), disciplina);
    }
}
