package EstrutuarasCondicionais01;
/*
Carlos trabalha em uma empresa de logística que opera apenas de segunda a sexta, sem atividades nos finais de semana.
Para evitar confusões, ele precisa de um programa que, ao receber um dia da semana, informe se é um dia útil ou não.
Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem indicando se é um dia útil ou não
 */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o digite o dia da semana (em letra minúscula): ");
        String dia = scanner.nextLine();
        scanner.close();

        if (dia.equals("segunda") || dia.equals("terca") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")){
            System.out.println(dia + "é um dia útil");
        }else {
            System.out.println(dia + " não é um dia útil");
        }
    }

}
