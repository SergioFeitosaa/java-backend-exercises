package br.com.sergio.poo.Encapsulamento.principal;

import br.com.sergio.poo.Encapsulamento.dominio.Bateria;

public class BateriaTest01 {
    public static void main(String[] args) {
        Bateria bateria = new Bateria();
        bateria.setNivel(85);
        System.out.println("Status: " + bateria.exibirStatus());
    }
}
