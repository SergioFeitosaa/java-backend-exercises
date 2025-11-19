package EstrutuarasCondicionais01;
/*
Emerson trabalha em um banco e precisa verificar se um número digitado pelo cliente está dentro da faixa permitida de valores para um empréstimo,
que vai de 1000 a 5000 reais.
Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.
 */

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do emprestimo");
        int valor = scanner.nextInt();

        if (valor >= 1000 && valor <= 5000) {
            System.out.println("O valor " + valor + " Está dentro do intervalo permitido para o empréstimo");
        }else{
            System.out.println("O valor " + valor + " não está dentro do invervalo permitido para o emprestimo");
        }

        scanner.close();

    }
}
