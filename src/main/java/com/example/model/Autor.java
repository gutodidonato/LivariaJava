package com.example.model;

public class Autor {

    private Integer id;
    private String nome;
    private String lingua;

    public Autor(Integer id, String nome, String lingua) {
        this.id = id;
        this.nome = nome;
        this.lingua = lingua;
    }

    public Autor(String nome, String lingua) {
        this.nome = nome;
        this.lingua = lingua;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }
    @Override
    public String toString() {
        return nome;
    }

    public Autor nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Autor lingua(String lingua) {
        this.lingua = lingua;
        return this;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }


}
