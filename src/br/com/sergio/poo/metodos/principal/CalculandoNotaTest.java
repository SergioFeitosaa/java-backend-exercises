package br.com.sergio.poo.metodos.principal;

import br.com.sergio.poo.metodos.dominio.CalculandoNotas;

public class CalculandoNotaTest {
    public static void main(String[] args) {
        CalculandoNotas calculandoNotas = new CalculandoNotas();
        calculandoNotas.nome = "Sérgio Feitosa";
        calculandoNotas.nota1 = 8.0;
        calculandoNotas.nota2 = 9.5;

        calculandoNotas.imprimeNota();

    }
}
