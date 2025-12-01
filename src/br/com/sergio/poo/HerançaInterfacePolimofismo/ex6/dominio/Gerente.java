package br.com.sergio.poo.HerançaInterfacePolimofismo.ex6.dominio;

public class Gerente extends Funcionario implements Aprovador{
    private double bonus;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Gerente: %s - salário %.2f - bônus: %.2f",
                nome, salario, bonus);
    }

    @Override
    public void calculaPRL() {
        System.out.println("PRL do gerente");
    }

    @Override
    public void aprovarProjeto(String nomeProjeto) {
        System.out.printf("\nGerente %s aprovou projeto %s", nome, nomeProjeto);
    }
}
