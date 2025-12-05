package br.com.sergio.poo.HerançaInterfacePolimofismo.ex1.principal;

import br.com.sergio.poo.HerançaInterfacePolimofismo.ex1.dominio.Aluno;
import br.com.sergio.poo.HerançaInterfacePolimofismo.ex1.dominio.Bolsita;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fernanda", "Regular");
        Bolsita aluno2 = new Bolsita("Lucas", "Bolsita");

        aluno1.identificador();
        aluno2.identificador();

    }
}
