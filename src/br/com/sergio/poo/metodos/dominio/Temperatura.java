package br.com.sergio.poo.metodos.dominio;

public class Temperatura {
    public String local;
    public double temperaturaAtural;

    public void imprime() {
        System.out.println("Sensor do local: " + local);
        System.out.printf("Temperatura: %.1f \n", temperaturaAtural);

        if (temperaturaAtural > 37.1) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }

}
