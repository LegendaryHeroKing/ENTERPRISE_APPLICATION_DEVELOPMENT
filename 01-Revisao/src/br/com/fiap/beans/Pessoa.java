package br.com.fiap.beans;

// classe abstrato não pode ser instanciado
//base para as outras classes
// pode conter metodos abstratos

public abstract class Pessoa {
	private String nome;
	
	public abstract void cadastrar();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
