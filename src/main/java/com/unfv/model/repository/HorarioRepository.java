package com.unfv.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unfv.model.Horario;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Integer>{

}
