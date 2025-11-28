package br.com.sergio.poo.HerançaInterfacePolimofismo.principal;

import br.com.sergio.poo.HerançaInterfacePolimofismo.dominio.Desenvolvedor;
import br.com.sergio.poo.HerançaInterfacePolimofismo.dominio.Funcionario;
import br.com.sergio.poo.HerançaInterfacePolimofismo.dominio.Gerente;

public class PrincipalTest {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Sérgio", 15000);
        ((Gerente)gerente).setBonus(1000);
        gerente.exibirInformacoes();
        gerente.reajusteSalario(2);


        Desenvolvedor desenvolvedor = new Desenvolvedor("Fernanda", 12000, "Backend Java");
        desenvolvedor.reajusteSalario();
        desenvolvedor.exibirInformacoes();
    }

}
