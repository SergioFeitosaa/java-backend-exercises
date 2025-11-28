package br.com.sergio.poo.metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario1;
    public double salario2;
    public double salario3;

    public void imprime() {
        System.out.printf("Funcionario: %s \n", nome);
        System.out.println("Idade: " + idade);
        System.out.println();

    }

    public void mediaDoSalario (){
        System.out.println((this.salario1 + this.salario2 + this.salario3) / 2);

    }
}
