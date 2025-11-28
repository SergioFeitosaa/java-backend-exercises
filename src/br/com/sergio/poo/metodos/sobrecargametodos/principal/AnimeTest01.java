package br.com.sergio.poo.metodos.sobrecargametodos.principal;

import br.com.sergio.poo.metodos.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("cyberpunk");
        anime.setTipo("TV");
        anime.setEpisodio(12);


        anime.imprime();
    }
}
