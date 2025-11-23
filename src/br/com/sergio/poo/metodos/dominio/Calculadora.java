package br.com.sergio.poo.metodos.dominio;

public class Calculadora {
    // MÉTODO SEM PARÂMENTROS
    public void somaDoisNumeros() {
        System.out.println(10 + 20);
    }

    public void subtraiDoisNumeros() {
        System.out.println(30 - 25);
    }
    // COM PARÂMENTROS
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    // COM PARÂMENTROS E RETORNO
    public double dividDoisNumeros(double num1, double num2) {
        return 2;
    }

}
