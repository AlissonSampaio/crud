package com.healthsolutions.crud.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.healthsolutions.crud.thymeleaf.processor.ClassForErrorAttributeTagProcessor;
import com.healthsolutions.crud.thymeleaf.processor.MessageElementTagProcessor;

public class CrudDialect extends AbstractProcessorDialect  {

	public CrudDialect() {
		super("HealthSolutions Crud", "crud", StandardDialect.PROCESSOR_PRECEDENCE);
	}

	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor> processadores = new HashSet<>();
		processadores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));
		processadores.add(new MessageElementTagProcessor(dialectPrefix));
		return processadores;
	}
}
