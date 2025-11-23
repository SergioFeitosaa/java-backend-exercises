package br.com.sergio.fundamentos.EstruturaDeRepeticoes02;

import java.util.Scanner;

public class Ex02 {
    /*
    Usando while, peça ao usuário para digitar números.
    Pare quando ele digitar 0.
    No final mostre a soma total.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        int numero = 1;
        int soma = 0;
        while (numero != 0){
            System.out.println("Digite o numero (0 para sair): ");
            numero = scanner.nextInt();

            if (numero != 0){
                soma += numero;
            }

            System.out.println("A soma dos numeros digitados é: " + soma);
        }

    }
}

