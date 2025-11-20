package EstruturaDeRepeticoes02;
/*
    Contar números positivos
    Peça números ao usuário e conte quantos deles foram positivos.
    Pare quando o usuário digitar 0.
    Ao final, mostre quantos positivos ele digitou.
 */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        int number = -1;
        int sum = 0;

        while (number != 0) {
            System.out.println("Digite (0 para sair): ");
            number = scanner.nextInt();

            if (number > 0) {
                sum++;
            }

            System.out.println("Vocë digitou: " + sum + " números positivos");
        }

    }
}
