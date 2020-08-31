package com.healthsolutions.crud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.healthsolutions.crud.model.Funcionario;
import com.healthsolutions.crud.repository.Funcionarios;
import com.healthsolutions.crud.repository.filter.FuncionarioFilter;
import com.healthsolutions.crud.service.CadastroFuncionarioService;

@Controller
@RequestMapping("/funcionarios")
public class FuncionariosController {
	
	@Autowired
	private CadastroFuncionarioService cadastroFuncionarioService;
	
	@Autowired
	private Funcionarios funcionarios;
	
	@RequestMapping("/novo")
	public ModelAndView novo(Funcionario funcionario) {
		ModelAndView mv = new ModelAndView("funcionario/CadastroFuncionario");
		return mv;
	}
	
	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Funcionario funcionario, BindingResult result, Model model, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return novo(funcionario);
		}
		
		cadastroFuncionarioService.salvar(funcionario);
		attributes.addFlashAttribute("mensagem", "Funcionario salvo com sucesso!");
		return new ModelAndView("redirect:/funcionarios/novo");
		
	}
	
	@GetMapping
	public ModelAndView pesquisar(FuncionarioFilter funcionarioFilter, BindingResult result) {
		ModelAndView mv = new ModelAndView("funcionario/PesquisaFuncionario");
		mv.addObject("funcionarios", funcionarios.filtrar(funcionarioFilter));
		return mv;
	}
}
