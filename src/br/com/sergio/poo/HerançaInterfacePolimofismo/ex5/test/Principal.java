package br.com.sergio.poo.HerançaInterfacePolimofismo.ex5.test;

import br.com.sergio.poo.HerançaInterfacePolimofismo.ex5.dominio.BoletoBancario;
import br.com.sergio.poo.HerançaInterfacePolimofismo.ex5.dominio.CartaoCredito;
import br.com.sergio.poo.HerançaInterfacePolimofismo.ex5.dominio.Pagamento;
import br.com.sergio.poo.HerançaInterfacePolimofismo.ex5.dominio.Pix;

public class Principal {
    public static void main(String[] args) {
        Pagamento cartao = new CartaoCredito(250.00);
        Pagamento boleto = new BoletoBancario(500.00);
        Pagamento pix = new Pix(300.00);


        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();

    }


}
