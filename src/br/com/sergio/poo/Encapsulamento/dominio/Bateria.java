package br.com.sergio.poo.Encapsulamento.dominio;

public class Bateria {
    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0 && nivel <= 100) {
            this.nivel = nivel;
        }
    }

    public String exibirStatus () {
        if (nivel <= 20) {
            System.out.println("Bateria Fraca");
        }else if (nivel <=80){
            System.out.println("Bateria ok");
        }else {
            return "Bateria cheia";
        }
        return "";
    }
}