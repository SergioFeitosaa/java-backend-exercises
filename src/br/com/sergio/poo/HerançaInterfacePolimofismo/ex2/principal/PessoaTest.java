package br.com.sergio.poo.HerançaInterfacePolimofismo.ex2.principal;

import br.com.sergio.poo.HerançaInterfacePolimofismo.ex2.dominio.Aluno;
import br.com.sergio.poo.HerançaInterfacePolimofismo.ex2.dominio.Docente;

import javax.print.Doc;

public class PessoaTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Julia", 16,8.5);
        Aluno aluno2 = new Aluno("Caio", 17, 7.2);

        Docente docente1 = new Docente("Marta", 40, "Matemática");
        Docente docente2 = new Docente("Roberto", 38, "História");

        aluno1.imprime();
        aluno2.imprime();

        docente1.imprime();
        docente2.imprime();
    }
}
