package br.com.sergio.poo.Encapsulamento.dominio;

public class Carro {
/*
Crie um programa que:
Defina uma classe com os atributos modelo, placa e ano.
Defina uma instancia dessa classe através do método construtor.
Exiba as informações do veículo no console.
 */
    private String modelo;
    private String placa;
    private int ano;

    public Carro(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void imprime (){
        System.out.println("Veiculo cadastrado: ");
        System.out.printf("Modelo: %s\n", getModelo());
        System.out.printf("Placa: %s\n", getPlaca());
        System.out.printf("Ano: %s",getAno());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
