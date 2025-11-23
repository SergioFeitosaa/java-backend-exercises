package br.com.sergio.poo.classes.ex2;

public class princialCarro01 {
    public static void main(String[] args) {
        Carro01 carro01 = new Carro01();
        carro01.marca = "Volkswagen";
        carro01.modelo = "Fox";
        carro01.ano = 2014;

        Carro01 carro2 = new Carro01();
        carro2.marca = "Chevrolet";
        carro2.modelo = "Onix";
        carro2.ano = 2025;

        Carro01 carro3 = new Carro01();
        carro3.marca = "Fiat";
        carro3.modelo = "Cronos";
        carro3.ano = 2024;

        carro01.imprimeCarros();
        carro2.imprimeCarros();
        carro3.imprimeCarros();
    }
}
