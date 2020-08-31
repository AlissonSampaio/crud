package com.healthsolutions.crud.repository.helper.funcionario;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.healthsolutions.crud.model.Funcionario;
import com.healthsolutions.crud.repository.filter.FuncionarioFilter;

public class FuncionariosImpl implements FuncionariosQueries {

	@PersistenceContext
	private EntityManager manager;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public List<Funcionario> filtrar(FuncionarioFilter filtro) {
		Criteria criteria = manager.unwrap(Session.class).createCriteria(Funcionario.class);
		if (filtro != null) {
			if(!StringUtils.isEmpty(filtro.getCodigo())) {
				criteria.add(Restrictions.eq("codigo", filtro.getCodigo()));
			}
			if(!StringUtils.isEmpty(filtro.getNome())) {
				criteria.add(Restrictions.eq("nome", filtro.getNome()));
			}
		}
		return criteria.list();
	}
}
