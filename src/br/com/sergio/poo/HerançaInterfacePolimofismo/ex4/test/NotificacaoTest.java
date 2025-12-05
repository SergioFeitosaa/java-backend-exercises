package br.com.sergio.poo.HerançaInterfacePolimofismo.ex4.test;

import br.com.sergio.poo.HerançaInterfacePolimofismo.ex4.dominio.Email;
import br.com.sergio.poo.HerançaInterfacePolimofismo.ex4.dominio.Push;
import br.com.sergio.poo.HerançaInterfacePolimofismo.ex4.dominio.SMS;

public class NotificacaoTest {
    public static void main(String[] args) {
        Email email = new Email("cliente@exemplo.com", "Promoção Especial!", "Aproveite nossos descontos esta semana.");
        SMS sms = new SMS("(11) 98765-4321", "Sua Fatura foi paga com sucesso");
        Push push = new Push("usuario_app", "Novidade!", "Voê tem uma nova mensagem não linda.");

        email.enviar();
        sms.enviar();
        push.enviar();
    }


}
