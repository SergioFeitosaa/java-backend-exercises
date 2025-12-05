package br.com.sergio.poo.HerançaInterfacePolimofismo.ex10.dominio;

public class Deposito extends OperacaoBancaria{

    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Saque de R$%.2f realizado\n", valor);
    }
}
