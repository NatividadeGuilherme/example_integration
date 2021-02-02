package br.com.testando.teste.integrado.dataprovider.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nome;
	
	public Animal(String nome) {
		super();
		this.nome = nome;
	}



	public String getNome() {
		return nome;
	}
}
