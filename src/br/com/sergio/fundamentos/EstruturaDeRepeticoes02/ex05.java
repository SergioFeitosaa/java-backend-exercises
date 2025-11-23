package br.com.sergio.fundamentos.EstruturaDeRepeticoes02;

import java.util.Scanner;

public class ex05 {
    /*
    Faça um programa que:
    Pergunta: "Digite um número (0 para sair):"
    Lê o número.
    Repete enquanto o número não for 0.
👉 Objetivo: aprender controle com número simples.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um numero (0 para sair): ");
            numero = scanner.nextInt();
        } while (numero != 0);
        System.out.println("Programa encerrado!");

        String frase;
        System.out.println("Digite uma frase(ou 'sair' para encerrar)");

        do {
            System.out.println("Você digitou: ");
            frase = scanner.nextLine();

        } while (!frase.equalsIgnoreCase("Sair"));
        System.out.println("Programa finalizado!");
        scanner.close();

    }


}


