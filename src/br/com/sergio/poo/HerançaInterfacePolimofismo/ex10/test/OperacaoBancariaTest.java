package br.com.sergio.poo.HerançaInterfacePolimofismo.ex10.test;

import br.com.sergio.poo.HerançaInterfacePolimofismo.ex10.dominio.Deposito;
import br.com.sergio.poo.HerançaInterfacePolimofismo.ex10.dominio.OperacaoBancaria;
import br.com.sergio.poo.HerançaInterfacePolimofismo.ex10.dominio.Saque;

public class OperacaoBancariaTest {
    public static void main(String[] args) {
        OperacaoBancaria deposito = new Deposito(200);
        OperacaoBancaria saque = new Saque(50.5);

        deposito.executar();
        saque.executar();
    }



}
