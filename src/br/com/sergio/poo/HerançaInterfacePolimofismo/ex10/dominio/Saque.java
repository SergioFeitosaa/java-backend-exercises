package br.com.sergio.poo.HerançaInterfacePolimofismo.ex10.dominio;

public class Saque extends OperacaoBancaria {

    public Saque(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Depósito de R$%.2f realizado\n", valor);
    }
}
