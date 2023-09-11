package br.com.finfacilita;

public class Usuario extends Pessoa {

	private String eMail;

	private String nomeUsuario;

	private ExibirAtivoUsuario exibirAtivoUsuario;

	private Senha senha;

	private PoderCompraOuInvestimento poderCompraOuInvestimento;

	private Despesa despesa;

	private Receita receita;

	private Objetivo objetivo;

	public void cadastrarUsuario(int cpf, String eMail, String nomeUsuario, String senhahash) {

	}

	public void mudarSenha(String senhaAtual, String senhaNova) {

	}

	public void excluirUsuario(String senhahash) {

	}

	@Override
	protected void cadastrarUsuario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void excluirUsuario() {
		// TODO Auto-generated method stub
		
	}

}
