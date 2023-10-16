package org.example;

public class Livro {
    private String nome;
    private String nomeAutor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public Livro(String nome, String nomeAutor) {
        this.nome = nome;
        this.nomeAutor = nomeAutor;
    }
}
