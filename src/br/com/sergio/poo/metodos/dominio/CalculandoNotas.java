package br.com.sergio.poo.metodos.dominio;

public class CalculandoNotas {
    public String nome;
    public double nota1;
    public double nota2;

    public void imprimeNota () {
        double media = (nota1 + nota2) / 2;


        System.out.printf("Aluno: %s\n", nome);
        System.out.printf("Nota 1: %.1f\n", nota1);
        System.out.printf("Nota 2: %.1f\n", nota2);
        System.out.printf("Media: %.2f\n", media);

        if (media >= 7){
            System.out.println("Situação: Aprovado!");
        }else {
            System.out.println("Situação: Reprovado!");
        }

    }

}
