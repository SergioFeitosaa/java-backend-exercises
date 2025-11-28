package br.com.sergio.poo.Encapsulamento.construtor.principal;


import br.com.sergio.poo.Encapsulamento.construtor.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Cyberpunk", "TV", 12, "Ação", "Production IG");
        anime.imprime();
    }
}
