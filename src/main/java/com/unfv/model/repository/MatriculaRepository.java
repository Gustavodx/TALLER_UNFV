package com.unfv.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unfv.model.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {

	Matricula findByIdalumnoAndIdcurso(int idalumno,int idcurso);
	List<Matricula> findByIdalumno(int idalumno);
}
