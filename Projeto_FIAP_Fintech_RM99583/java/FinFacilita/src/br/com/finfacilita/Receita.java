package br.com.finfacilita;

import java.util.Collection;
import java.util.Date;

public class Receita extends TransacaoCadastrada {
	
	//SUB-CLASSE RECEITA
	
	//ATRIBUTOS SUB-CLASSE RECEITA



	private boolean receitaFixa;

	private boolean novoReceitaFixa;

	private Collection<Usuario> usuario;

	private Collection<PoderCompraOuInvestimento> poderCompraOuInvestimento;
	
	//CONSTRUTORES SUB-CLASSE RECEITA
	public Receita(String nome, double valor, Date data, int tipoTransacao, String novoNome, double novoValor,
			Date novoData) {
		super(nome, valor, data, tipoTransacao, novoNome, novoValor, novoData);
		
	}
	
	//METODOS SUB-CLASSE RECEITA

	@Override
	protected void cadastrarTransacao(String nome, double valor, Date data, int tipoTransacao) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void alterarTransacao(String nome, String novoNome, double valorNovo, Date dataNovo) {
		// TODO Auto-generated method stub
		
	}

	public void cadastrarTransacao(String nome, double valor, Date data, int tipoTransacao, boolean receitaFixa) {

	}

	public void alterarTransacao(String nome, String novoNome, double novoValor, Date novoData, boolean novoReceitaFixa) {

	}

	public void excluirTransacao(String nome, int tipoTransacao) {

	}

	//GETTERS SUB-CLASSE RECEITA

	public boolean isReceitaFixa() {
		return receitaFixa;
	}

	//SETTERS SUB-CLASSE RECEITA

	public void setReceitaFixa(boolean receitaFixa) {
		this.receitaFixa = receitaFixa;
	}

	
	

}
