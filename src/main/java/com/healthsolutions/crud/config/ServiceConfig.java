package com.healthsolutions.crud.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.healthsolutions.crud.service.CadastroFuncionarioService;

@Configuration
@ComponentScan(basePackageClasses = CadastroFuncionarioService.class)
public class ServiceConfig {

}
