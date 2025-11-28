package br.com.sergio.poo.Encapsulamento.principal;

import br.com.sergio.poo.Encapsulamento.dominio.Produto;
/*
Defina uma classe para representar um produto com nome e preço.
Valide se o preço é um valor não negativo antes de atualizá-lo.
Se o valor for negativo, então deverá ser redefinido para 0.00.
Exiba uma mensagem quando a validação falhar.
Por fim, exiba uma mensagem com os dados do produto.
 */

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Mouse");
        produto.setPreco(-59.90);

        System.out.printf("Produto: %s \nPreço: %.2f\n",produto.getNome(), produto.getPreco());

    }
}
