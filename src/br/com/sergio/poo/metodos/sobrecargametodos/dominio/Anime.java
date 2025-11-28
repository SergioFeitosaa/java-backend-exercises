package br.com.sergio.poo.metodos.sobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodio;
    private String genero;


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
    }

    public void init(String nome, String tipo, int episodio) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;

    }

    public void init(String nome, String tipo, int episodio, String genero) {
        this.init(nome, tipo, episodio);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public int getEpisodio() {
        return this.episodio;
    }
}
