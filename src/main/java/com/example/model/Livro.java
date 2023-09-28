package com.example.model;

import java.math.BigDecimal;

//Criação da classe Livro 
public class Livro { 
    private Integer capitulos;
    private BigDecimal valor;
    private Autor autor;
    private Integer id;
    private String titulo;
    private String serie;
    public Livro(Integer id, String titulo, String serie, Integer capitulos, BigDecimal valor, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.serie = serie;
        this.capitulos = capitulos;
        this.valor = valor;
        this.autor = autor;
    }
    public Livro(String titulo, String serie, Integer capitulos, BigDecimal valor, Autor autor) {
        this.titulo = titulo;
        this.serie = serie;
        this.capitulos = capitulos;
        this.valor = valor;
        this.autor = autor;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public String getSerie() {
        return serie;
    }
    
    public void setCapitulos(Integer capitulos) {
        this.capitulos = capitulos;
    }

    public BigDecimal getValor() {
        return valor;
    }


    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getCapitulos() {
        return capitulos;
    }


    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", serie=" + serie + ", capitulos=" + capitulos + ", valor=" + valor + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Livro valor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public Autor getAutor() {
        return autor;
    }

    public Livro serie(String serie) {
        this.serie = serie;
        return this;
    }

    public Livro capitulos(Integer capitulos) {
        this.capitulos = capitulos;
        return this;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public Livro titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }
    


    
}
