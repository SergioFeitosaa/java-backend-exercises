package br.com.sergio.poo.HerançaInterfacePolimofismo.ex5.dominio;

public class BoletoBancario extends Pagamento {

    public BoletoBancario(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Boleto de R$%s gerado com sucesso (Taxa:%s)\n", valor,calcularTaxa());
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.1;
    }
}
