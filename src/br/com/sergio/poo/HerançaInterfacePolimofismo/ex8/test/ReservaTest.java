package br.com.sergio.poo.HerançaInterfacePolimofismo.ex8.test;

import br.com.sergio.poo.HerançaInterfacePolimofismo.ex7.dominio.ReservaVip;
import br.com.sergio.poo.HerançaInterfacePolimofismo.ex8.dominio.Reserva;

public class ReservaTest {
    public static void main(String[] args) {
        Reserva reserva = new Reserva();

        reserva.reservar();
        reserva.reservar("10/04");
        reserva.reservar("12/04", 4);

        ReservaVip reservaVip = new ReservaVip();
        reservaVip.reservar();
    }
}
