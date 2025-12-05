package br.com.sergio.poo.HerançaInterfacePolimofismo.ex8.dominio;

public class Reserva {

    public void reservar (){
        System.out.println("Reserva realizada");
    }

    public void reservar (String data){
        System.out.println("Reserva feita para o dia " + data);
    }

    public void reservar (String data, int quantidadeDePessoas) {
        System.out.println("Reserva feita para o dia " + data + " para " + quantidadeDePessoas + " pessoas");
    }
}
