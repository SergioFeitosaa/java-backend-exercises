package br.com.sergio.poo.Encapsulamento.principal;

import br.com.sergio.poo.Encapsulamento.dominio.Usuario;

public class UsuarioTest {
    public static void main(String[] args) {
        Usuario user = new Usuario ("123456");
        user.setSenha("123456", "abc123");
    }
}
