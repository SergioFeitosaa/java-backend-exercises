package br.com.sergio.poo.classes.ex2;
/*
Crie uma classe Carro com:
marca, modelo, ano
método exibirDados() que imprime tudo
No main, crie 3 carros diferentes e chame o método.
 */

public class Carro01 {
    String marca;
    String modelo;
    int ano;

    public void imprimeCarros (){
        System.out.printf("Marca:%s - Modelo:%s - Ano:%d \n", marca, modelo, ano);
    }
}
