package br.com.sergio.poo.metodos.dominio;

public class Tarefa {
    public String descricao;
    public boolean concluido;

    public void imprimi (){
        if (concluido){
            System.out.println("Tarefa: " + descricao + " - status: concluida");
        }else {
            System.out.println("Tarefa: " + descricao + " - status: pendente");
        }
    }
}
