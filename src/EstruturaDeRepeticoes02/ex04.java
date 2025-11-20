package EstruturaDeRepeticoes02;
/*
Faça um programa que:
Mostra a mensagem:
"Pressione ENTER para continuar. Digite 'sair' para encerrar."
O programa repete enquanto o usuário não digitar "sair".
Objetivo: entender que o loop continua até um valor específico aparecer.
 */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;

        do {
            System.out.println("Pressione Enter para continuar. Digite 'sair' para encerrar");
            texto = scanner.nextLine();
        } while (!texto.equalsIgnoreCase("Sair"));
        System.out.println("Programa finalizado!");
    }
}
