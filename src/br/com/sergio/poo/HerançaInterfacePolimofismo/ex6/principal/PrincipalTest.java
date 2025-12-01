package br.com.sergio.poo.HerançaInterfacePolimofismo.ex6.principal;

import br.com.sergio.poo.HerançaInterfacePolimofismo.ex6.dominio.Desenvolvedor;
import br.com.sergio.poo.HerançaInterfacePolimofismo.ex6.dominio.Funcionario;
import br.com.sergio.poo.HerançaInterfacePolimofismo.ex6.dominio.Gerente;

public class PrincipalTest {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Sérgio", 15000);
        ((Gerente)gerente).setBonus(1000);
        gerente.exibirInformacoes();
        gerente.reajusteSalario(2);
        ((Gerente) gerente).aprovarProjeto("USO DE IA NOS CÓDIGOS JAVA");


        Desenvolvedor desenvolvedor = new Desenvolvedor("Fernanda", 12000, "Backend Java");
        desenvolvedor.reajusteSalario();
        desenvolvedor.exibirInformacoes();



    }

}
