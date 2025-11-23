package br.com.sergio.fundamentos.EstrutuarasCondicionais01;
/*
Peça ao usuário para digitar um tipo de combustível:
1 → Gasolina
2 → Etanol
3 → Diesel
Com base nisso, use um switch para mostrar o preço por litro.
Gasolina → R$ 5.89
Etanol → R$ 4.29
Diesel → R$ 6.49
Se o usuário digitar qualquer outro número, exiba "Opção inválida".
 */

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 → Gasolina");
        System.out.println("2 → Etanol");
        System.out.println("3 → Diesel");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Gasolina - R$ 5.89");
                break;
            case 2:
                System.out.println("Etanol - R$ 4.49");
                break;
            case 3:
                System.out.println("Diesel - R$ 6.49");
        }


    }
}
