package br.com.sergio.poo.metodos.dominio;

public class Colaborador {
    public String nome;
    public String cargo;
    public int nivelDeAcesso;

    public void atualizarDados(String novoCargo, int novoNivel){
        System.out.println("---Antes da Atualização---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nivel de Acesso: " + nivelDeAcesso);

        cargo = novoCargo;
        nivelDeAcesso = novoNivel;

        System.out.println("---Após Atualização---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + novoCargo);
        System.out.println("Nivel de acesso: " + novoNivel);

    }
}
