package br.com.finfacilita;

import java.util.Collection;

public class Usuario extends Pessoa {
	
	//SUB-CLASSE USUARIO
	

	//ATRIBUTOS

	private String eMail;

	private String nomeUsuario;

	private Collection<Ativo> exibirAtivoUsuario;

	private String senha;

	private PoderCompraOuInvestimento poderCompraOuInvestimento;

	private Despesa despesa;

	private Receita receita;

	private Objetivo objetivo;

	private TransacaoCadastrada transacaoCadastrada;
	

	
	//CONSTRUTORES SUB-CLASSE USUARIO
	
	
	//PADRAO
	public Usuario( ) {
		super();
	}
	
	//SOBRECARGA (OVERLOAD)
	public Usuario(int cpf) {
		super(cpf);
	}

	//CONSTRUTOR COM PARAMETROS
	public Usuario(int cpf, String eMail, String nomeUsuario, String senhahash) {
		super(cpf);
		this.eMail = eMail;
		this.nomeUsuario = nomeUsuario;
		this.senha = senhahash;
	}
	
	
	
	
	//MÉTODOS SUB-CLASSE USUARIO HERDADOS
	
	
	@Override
	protected void cadastrarUsuario() {
	}
	
	@Override
	protected void excluirUsuario() {
	}
	
	
	
	
	//MÉTODOS SUB-CLASSE USUARIO
	

	public void cadastrarUsuario(int cpf, String eMail, String nomeUsuario, String senhahash) {

		this.setCpf(cpf);
		this.seteMail(eMail);
		this.setNomeUsuario(nomeUsuario);
		this.setSenha(senhahash);
	}

	public void mudarSenha(String senhaAtual, String senhaNova) {
		if ( this.getSenha() == senhaAtual) {
			this.setSenha(senhaNova);
			System.out.println("Sua senha foi alterada com sucesso!");
			System.out.println("");
		}
	}

	public void excluirUsuario(String senhahash) {
		//TODO Excluir Usuario	
		if ( this.getSenha() == senhahash) {
			int excluircpf = this.getCpf();
			System.out.println("O usuário de cpf " + excluircpf + " foi excluído!");
			System.out.println("");
		}
		else {
			System.out.println("Senha incorreta, tente novamente!");
			System.out.println("");
		}
	}

	
	
	//GETTERS SUB-CLASSE USUARIO

	public String geteMail() {
		return eMail;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}
	
	
	
	//SETTERS SUB-CLASSE USUARIO

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	

}
