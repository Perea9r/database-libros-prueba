package com.libros.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.libros.crud.model.Libro;

public interface LibrosRepository extends JpaRepository<Libro, Integer> {
    
}
