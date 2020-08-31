package com.healthsolutions.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoid;
	
	@NotBlank(message = "Codigo é obrigatório")
	private String codigo;
	
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoid == null) ? 0 : codigoid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (codigoid == null) {
			if (other.codigoid != null)
				return false;
		} else if (!codigoid.equals(other.codigoid))
			return false;
		return true;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
}

	public Long getCodigoId() {
		return codigoid;
	}
	
	public void setCodigoId(Long codigoId) {
		this.codigoid = codigoId;
	}
}