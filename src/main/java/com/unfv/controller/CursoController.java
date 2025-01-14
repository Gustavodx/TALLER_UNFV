package com.unfv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.unfv.model.repository.CursoRepository;
import com.unfv.model.repository.HorarioRepository;
import com.unfv.model.repository.ProfesorRepository;

@Controller
public class CursoController {
	
	@Autowired
	private CursoRepository cRepo;
	@Autowired
	private ProfesorRepository pRepo;
	@Autowired
	private HorarioRepository hRepo;
	
	@GetMapping("/cargaHome")
	public String cargarHome(Model model) {
		return "Home";
	}
	
	@GetMapping("/cargaPrincipal")
	public String cargarPrincipal(Model model) {
		return "Principal";
	}
	
	@GetMapping("/cargaCur")
	public String cargarCur(Model model) {
		model.addAttribute("lstCursos", cRepo.findAll());
		model.addAttribute("lstHorarios", hRepo.findAll());
		model.addAttribute("lstProfesores", pRepo.findAll());
		return "Cursos";
	}	

}
