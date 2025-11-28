package br.com.sergio.poo.HerançaInterfacePolimofismo.dominio;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.printf("\nFuncionario %s - Salário: %.2f", nome, salario);
    }

    public void reajusteSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("\nNovo salario de %s é %.2f ", nome, salario);
    }

    public void reajusteSalario(){
        salario += 500;
        System.out.printf("\nSalário com dissídio de %s é %.2f ", nome, salario);
    }

}
