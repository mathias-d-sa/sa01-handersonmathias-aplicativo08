package br.com.senaitagua.sa1.bo;

public class Piloto {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean verificarAposentadoria() {
		boolean resp;
		if (idade >= 65) {
			resp = true;
		} else {
			resp = false;
		}
		return resp;
	}
	
	
}
