package com.healthsolutions.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthsolutions.crud.model.Funcionario;
import com.healthsolutions.crud.repository.helper.funcionario.FuncionariosQueries;

@Repository
public interface Funcionarios extends JpaRepository<Funcionario, Long>, FuncionariosQueries {
	

}
