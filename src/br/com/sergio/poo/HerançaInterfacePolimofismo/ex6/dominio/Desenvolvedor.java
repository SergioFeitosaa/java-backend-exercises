package br.com.sergio.poo.HerançaInterfacePolimofismo.ex6.dominio;

public class Desenvolvedor extends Funcionario{
    private String stack;

    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome, salario);
        this.stack = stack;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("\nDesenvolvedor: %s - Salário: %.2f - Stack: %s",nome, salario, stack);
    }

    @Override
    public void calculaPRL() {
        System.out.printf("PRL do desenvolvedor");
    }
}
