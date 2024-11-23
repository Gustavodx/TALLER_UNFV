package com.unfv.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_horarios")
public class Horario {
	@Id
	private int idhorario;
	private String deshorario;
	  
	public int getIdhorario() {
		return idhorario;
	}
	public void setIdhorario(int idhorario) {
		this.idhorario = idhorario;
	}
	public String getDeshorario() {
		return deshorario;
	}
	public void setDeshorario(String deshorario) {
		this.deshorario = deshorario;
	}
	@Override
	public String toString() {
		return "Horario [idhorario=" + idhorario + ", deshorario=" + deshorario + "]";
	}

}
