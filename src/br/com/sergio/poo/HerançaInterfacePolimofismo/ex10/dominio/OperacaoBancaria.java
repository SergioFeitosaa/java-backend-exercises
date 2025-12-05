package br.com.sergio.poo.HerançaInterfacePolimofismo.ex10.dominio;

public abstract class OperacaoBancaria implements AcaoBancaria {
    protected double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }
}
