package com.libros.crud.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.libros.crud.model.Libro;

@Service
public interface LibrosService {
    List<Libro> libros();
    Libro buscarLibro(int isbn);
    void altaLibro(Libro libro);
    void actualizarLibro(Libro libro);
    List<Libro> eliminarLibro(int isbn);
}
