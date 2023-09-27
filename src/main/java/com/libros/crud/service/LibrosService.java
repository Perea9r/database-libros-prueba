package com.libros.crud.service;

import java.util.List;
import com.libros.crud.model.Libro;

public interface LibrosService {
    List<Libro> libros();
    Libro buscarLibro(int isbn);
    void altaLibro(Libro libro);
    void actualizarLibro(Libro libro);
    void eliminarLibro(int isbn);
}
