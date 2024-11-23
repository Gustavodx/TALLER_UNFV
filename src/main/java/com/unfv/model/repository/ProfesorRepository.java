package com.unfv.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unfv.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer>{

}
