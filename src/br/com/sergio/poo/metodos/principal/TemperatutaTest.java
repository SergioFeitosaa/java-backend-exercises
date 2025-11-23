package br.com.sergio.poo.metodos.principal;

import br.com.sergio.poo.metodos.dominio.Temperatura;
/*
Crie uma classe que:
Possua os atributos local, indicando o setor monitorado, e temperatura atual, armazenando a última medição.
Implemente um método que mostre:
O local do sensor.
A temperatura formatada com uma casa decimal.
Um alerta se a temperatura ultrapassar 37.5ºC.
 */

public class TemperatutaTest {
    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();
        temperatura.local = "Setor A";
        temperatura.temperaturaAtural = 40.2;

        temperatura.imprime();
    }

}
