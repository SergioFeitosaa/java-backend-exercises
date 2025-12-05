package br.com.sergio.poo.HerançaInterfacePolimofismo.ex9.test;

import br.com.sergio.poo.HerançaInterfacePolimofismo.ex9.dominio.Relatorio;

public class RelatorioTest {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio("Relatório 2025", "Tudo funcionando conforme o esperado.");

        relatorio.imprimir();
    }


}
