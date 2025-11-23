package br.com.sergio.fundamentos.EstrutuarasCondicionais01;
  /*
    Jéssica trabalha no setor de TI de uma empresa e precisa garantir a segurança dos acessos ao sistema interno.
    Os funcionários utilizam uma senha fixa para acessar suas contas, e o sistema deve verificar se a senha inserida está correta.
     Ajude Jéssica a criar um programa que, com base em uma senha pré-definida, por exemplo: 123456, verifique se o que o usuário digitou está correto ou não.
     O programa deve comparar a tentativa com a senha correta e exibir se o acesso foi permitido ou negado.
     */
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        String senhaCorreta = "123456";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String tentativaSenha = scanner.nextLine();

        scanner.close();

        if (tentativaSenha.equals(senhaCorreta)){
            System.out.println("Acesso permitido!");
        }else {
            System.out.println("Acesso negado!");
        }


    }
}
