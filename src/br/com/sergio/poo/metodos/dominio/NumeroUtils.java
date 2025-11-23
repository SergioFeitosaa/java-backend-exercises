package br.com.sergio.poo.metodos.dominio;

public class NumeroUtils {

    public boolean ehpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Número é par: " + numero);
            return true;
        } else {
            System.out.println("Número é impar: " + numero);
            return false;
        }

    }

}
