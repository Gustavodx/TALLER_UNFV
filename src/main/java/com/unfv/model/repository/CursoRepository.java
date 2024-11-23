package com.unfv.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unfv.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
