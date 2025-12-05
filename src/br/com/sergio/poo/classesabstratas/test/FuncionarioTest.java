package br.com.sergio.poo.classesabstratas.test;

import br.com.sergio.poo.classesabstratas.dominio.Desenvolvedor;
import br.com.sergio.poo.classesabstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alan", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Sérgio", 12000);
        System.out.println(desenvolvedor);
        System.out.println(gerente);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
