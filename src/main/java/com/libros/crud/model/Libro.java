package com.libros.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int isbn;
    private String titulo;
    private String tematica;

    public Libro(){
        
    }

    public Libro(int isbn, String titulo, String tematica) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.tematica = tematica;
    }

    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTematica() {
        return tematica;
    }
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
}
