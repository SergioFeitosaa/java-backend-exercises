package br.com.sergio.poo.metodos.principal;

import br.com.sergio.poo.metodos.dominio.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaTest {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa();
        tarefa1.descricao = "Estudar java";
        tarefa1.concluido = true;

        Tarefa tarefa2 = new Tarefa();
        tarefa2.descricao = "Fazer execicios";
        tarefa2.concluido = false;

        List<Tarefa> lista = new ArrayList<>();
        lista.add(tarefa1);
        lista.add(tarefa2);

        for (Tarefa t : lista) {
            t.imprimi();
        }


    }
}

