package EstruturaDeRepeticoes02;

import java.util.Formattable;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor: " + i);
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de degraus: ");
        int degraus = scanner.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Você chegou ao topo!");

    }
    

}