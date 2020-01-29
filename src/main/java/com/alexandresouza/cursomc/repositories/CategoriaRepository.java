package com.alexandresouza.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexandresouza.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{

}
