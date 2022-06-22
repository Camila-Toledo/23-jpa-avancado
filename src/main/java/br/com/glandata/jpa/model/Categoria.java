package br.com.glandata.jpa.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {

	public Categoria() {
	}

	public Categoria(String nome) {
		this.id = new CategoriaId(nome, "CATEGORIA");
	}

	@EmbeddedId
	private CategoriaId id;

	public String getNome() {
		return id.getNome();
	}
	
	/*
	 * @Getter
	 * 
	 * @Setter
	 * 
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	 * 
	 * @Getter
	 * 
	 * @Setter private String nome;
	 */

}
