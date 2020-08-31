package com.healthsolutions.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.healthsolutions.crud.model.Funcionario;
import com.healthsolutions.crud.repository.Funcionarios;

@Service
public class CadastroFuncionarioService {
	
	@Autowired
	private Funcionarios funcionarios;
	
	@Transactional
	public void salvar(Funcionario funcionario) {
		funcionarios.save(funcionario);	
	}
}
