package br.com.finfacilita;

public abstract class Pessoa {
	
	//CLASSE BASE PESSOA - ABSTRATA
	
	

	//ATRIBUTOS CLASSE BASE PESSOA - ABSTRATOS
	
	protected int cpf;
	
	

	//CONSTRUTORES CLASSE BASE PESSOA
	
	//PADRÃO
	public Pessoa( ) {
	}
	
	//SOBRECARGA (OVERLOAD)
	public Pessoa(int cpf) {
		super();
		this.cpf = cpf;
	}
	
	

	//MÉTODOS CLASSE BASE PESSOA - ABSTRATOS
	
	protected abstract void cadastrarUsuario();

	protected abstract void excluirUsuario();


	

	//GETTERS CLASSE BASE PESSOA

	public int getCpf() {
		return cpf;
	}

	
	
	
	//SETTERS CLASSE BASE PESSOA

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	protected void excluirUsuario(int cpf) {		
		this.cpf = cpf;
	}


}
