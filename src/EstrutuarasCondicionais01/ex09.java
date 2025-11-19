package EstrutuarasCondicionais01;
/*
Crie um programa que mostra um menu simples de banco:
1 - Sacar
2 - Depositar
3 - Consultar saldo
4 - Sair
O usuário digita uma opção (1 a 4) e você usa um switch para exibir a ação correspondente:
Se for 1, mostrar "Saque realizado!"
Se for 2, mostrar "Depósito realizado!"
Se for 3, mostrar "Seu saldo é R$ 1.500,00"
Se for 4, mostrar "Saindo..."
Se digitar qualquer outra opção → "Opção inválida!"
 */

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Sair");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Saque realizado");
                break;
            case 2:
                System.out.println("Depósito realizado");
                break;
            case 3:
                System.out.println("Consultar saldo");
                break;
            case 4:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção invalida!");
        }

        scanner.close();
    }
}
