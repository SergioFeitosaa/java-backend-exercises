package br.com.sergio.poo.metodos.dominio;

public class Estoque {
    public String nome;
    public int quantidade;

    public void vender (int quantidadeVendida){
        if (quantidadeVendida <= quantidade){
            quantidade -= quantidadeVendida;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome,quantidade);
        }else {
            System.out.println("Estoque insuficiente");
        }
    }


}
