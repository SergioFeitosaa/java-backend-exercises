package br.com.sergio.poo.HerançaInterfacePolimofismo.ex7.dominio;

import br.com.sergio.poo.HerançaInterfacePolimofismo.ex8.dominio.Reserva;

public class ReservaVip extends Reserva {
    @Override
    public void reservar() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }
}
