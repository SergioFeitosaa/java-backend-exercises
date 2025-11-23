package br.com.sergio.poo.metodos.principal;

import br.com.sergio.poo.metodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora ();
        calculadora.multiplicaDoisNumeros(20, 20);

        System.out.println("Resultado:" + calculadora.dividDoisNumeros(10,2));
    }
}
