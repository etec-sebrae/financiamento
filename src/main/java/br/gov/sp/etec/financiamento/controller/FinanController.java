package br.gov.sp.etec.financiamento.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.etec.financiamento.dto.FinanEntity;
import br.gov.sp.etec.financiamento.repository.FinanRepository;



@Controller
public class FinanController {
	
	@Autowired
	FinanRepository repository;
	
	@GetMapping("/")
	public ModelAndView listar() {
		ModelAndView view = new ModelAndView("home");
	
		List<FinanEntity> home = repository.findAll();
		
		view.addObject(new FinanEntity());
		view.addObject("Home", home);
		
		return view;
	}
	@GetMapping("/cadastro_intencao")
	public String cadastro_intencao() {
		
		return "cadastro_intencao";
	}
	
	@PostMapping("/salvar")
	public String Salvar(FinanEntity intencao) {
		
		repository.save(intencao);
		
		return "redirect:/";
	}
	
	@GetMapping("/intencao/detalhar/{id}")
	public String detalhar(@PathVariable Long id, Model model) {
		
		
		FinanEntity finanEntity = repository.findById(id).get();
		model.addAttribute(finanEntity);
		
		return "intencao";
		
	}
	
	@GetMapping("/intencao/excluir/{id}")
	public String excluir (@PathVariable Long id, Model model) {
		
		
		repository.deleteById(id);
		
		return "redirect:/";
}

	
	}






		
	
	
	
	


