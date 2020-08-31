package com.healthsolutions.crud.repository.helper.funcionario;

import java.util.List;

import com.healthsolutions.crud.model.Funcionario;
import com.healthsolutions.crud.repository.filter.FuncionarioFilter;

public interface FuncionariosQueries {
	public List<Funcionario> filtrar(FuncionarioFilter filtro);
}
