package br.com.glandata.jpa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
public class CategoriaId implements Serializable {

	public CategoriaId() {
	}

	public CategoriaId(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private String nome;

	@Getter
	@Setter
	private String tipo;
}
