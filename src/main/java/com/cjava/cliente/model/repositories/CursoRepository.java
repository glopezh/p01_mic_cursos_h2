package com.cjava.cliente.model.repositories;

import com.cjava.cliente.model.entities.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, String> {
}
