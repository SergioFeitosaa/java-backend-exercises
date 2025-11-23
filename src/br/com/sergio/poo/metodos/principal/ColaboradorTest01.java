package br.com.sergio.poo.metodos.principal;

import br.com.sergio.poo.metodos.dominio.Colaborador;

public class ColaboradorTest01 {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        colaborador.nome = "Sérgio Feitosa";
        colaborador.cargo = "Desenvolvedora Júnior";
        colaborador.nivelDeAcesso = 1;

        colaborador.atualizarDados("Desenvolvedor Pleno", 2);

    }
}
