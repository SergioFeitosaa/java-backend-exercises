package br.com.sergio.poo.metodos.principal;

import br.com.sergio.poo.metodos.dominio.Estoque;

public class EstoqueTest {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.nome = "Camiseta";
        estoque.quantidade = 10;

        estoque.vender(3);
        estoque.vender(8);

    }
}
