package br.com.sergio.poo.metodos.principal;

import br.com.sergio.poo.metodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Sérgio Feitosa";
        funcionario.idade = 37;
        funcionario.salario1 = 3500;
        funcionario.salario2 = 4500;
        funcionario.salario3 = 7000;

        funcionario.imprime();
        funcionario.mediaDoSalario();

    }
}
