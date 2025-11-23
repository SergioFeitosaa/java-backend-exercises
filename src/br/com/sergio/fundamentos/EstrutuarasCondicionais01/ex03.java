package br.com.sergio.fundamentos.EstrutuarasCondicionais01;
/*
    Pedro está aprendendo Java e se deparou com um problema: ele precisa criar um programa que
    compare dois números inteiros fornecidos pelo usuário e informe qual é o maior ou se são iguais.
    Mas, ele está com dificuldades para implementar a lógica de comparação e exibir o resultado
    corretamente.

    Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois números inteiros,
    compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.
 */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é " + num1 + ".");
        } else if (num2 > num1) {
            System.out.println("O maior número é " + num2 + ".");
        }else {
            System.out.println("Os números sáo iguais");
        }
    }

}
