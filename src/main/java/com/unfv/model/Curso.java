package com.unfv.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cursos")
public class Curso {
	@Id
	private int idcurso;
	private String nomcurso;
	private int idhorario;
	private int idprof;
	
	public int getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}
	public String getNomcurso() {
		return nomcurso;
	}
	public void setNomcurso(String nomcurso) {
		this.nomcurso = nomcurso;
	}
	public int getIdhorario() {
		return idhorario;
	}
	public void setIdhorario(int idhorario) {
		this.idhorario = idhorario;
	}
	public int getIdprof() {
		return idprof;
	}
	public void setIdprof(int idprof) {
		this.idprof = idprof;
	}
	@Override
	public String toString() {
		return "Curso [idcurso=" + idcurso + ", nomcurso=" + nomcurso + ", idhorario=" + idhorario + ", idprof="
				+ idprof + "]";
	}

}
