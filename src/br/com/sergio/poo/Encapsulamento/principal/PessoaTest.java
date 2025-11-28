package br.com.sergio.poo.Encapsulamento.principal;


import br.com.sergio.poo.Encapsulamento.dominio.Pessoa;
import br.com.sergio.poo.Encapsulamento.dominio.Produto;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Sérgio Feitosa");
        pessoa.setIdade(37);
        pessoa.setIdade(-10);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());


    }
}
