package com.libros.crud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.libros.crud.model.Libro;
import com.libros.crud.repository.LibrosRepository;

@Service
public class LibrosServiceImpl implements LibrosService {
    @Autowired
    LibrosRepository repository;

    public LibrosServiceImpl() {
        repository.save(new Libro(111, "El imperio final", "Fantasía"));
        repository.save(new Libro(222, "El señor de los anillos", "Fantasía"));
        repository.save(new Libro(333, "Harry Potter", "Fantasía"));
        
    }

    public List<Libro> libros() {
        return repository.findAll();
    }

    @Override
    public Libro buscarLibro(int isbn) {
        return repository.existsById(isbn) ? repository.getReferenceById(isbn) : null;
    }

    @Override
    public void altaLibro(Libro libro) {
        repository.save(libro);
    }

    @Override
    public void actualizarLibro(Libro libro) {
        repository.save(libro);
    }

    @Override
    public void eliminarLibro(int isbn) {
        repository.deleteById(isbn);
    }
}