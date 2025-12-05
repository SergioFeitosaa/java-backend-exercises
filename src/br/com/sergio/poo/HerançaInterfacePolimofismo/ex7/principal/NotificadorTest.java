package br.com.sergio.poo.HerançaInterfacePolimofismo.ex7.principal;

import br.com.sergio.poo.HerançaInterfacePolimofismo.ex7.dominio.Notificador;

public class NotificadorTest {
    public static void main(String[] args) {
        Notificador notificador = new Notificador();

        notificador.enviarMensagem("Olá");
        notificador.enviarMensagem ("João", "Bom dia!");
        notificador.enviarMensagem("Maria", "Atenção", 2);

    }
}
