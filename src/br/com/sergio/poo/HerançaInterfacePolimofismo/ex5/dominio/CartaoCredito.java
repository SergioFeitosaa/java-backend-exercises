package br.com.sergio.poo.HerançaInterfacePolimofismo.ex5.dominio;

public class CartaoCredito extends Pagamento {

    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.3;
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento de R$%.2f confirmado no Cartão de Crédito (Taxa:%.2f)\n",valor, calcularTaxa());
    }
}
