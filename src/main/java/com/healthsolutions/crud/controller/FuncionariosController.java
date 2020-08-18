package com.healthsolutions.crud.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.healthsolutions.crud.model.Funcionario;

@Controller
public class FuncionariosController {
	
	@RequestMapping("/funcionarios/novo")
	public String novo(Funcionario funcionario) {
		return "funcionario/CadastroFuncionario";
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Funcionario funcionario, BindingResult result, Model model, RedirectAttributes attributes) {
		
		if(result.hasErrors()) {
			model.addAttribute("mensagem", "Erro no cadastro!");
			return novo(funcionario);
		}
		attributes.addAttribute("mensagem","Cerveja salva com sucesso!");
		System.out.println(">>>>>> codigo: " + funcionario.getCodigo());
		return "redirect:/funcionarios/novo";
	}
	
	@RequestMapping("/funcionarios/cadastro")
	public String cadastro() {
		return "funcionario/CadastroFuncionario";
	}
}
