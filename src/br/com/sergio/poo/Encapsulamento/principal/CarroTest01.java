package br.com.sergio.poo.Encapsulamento.principal;

import br.com.sergio.poo.Encapsulamento.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Fox", "ABC-2025", 2014);

        carro.imprime();

    }
}
