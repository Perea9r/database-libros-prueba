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
    public List<Libro> eliminarLibro(int isbn) {
        repository.deleteById(isbn);
        return repository.findAll();
    }
}