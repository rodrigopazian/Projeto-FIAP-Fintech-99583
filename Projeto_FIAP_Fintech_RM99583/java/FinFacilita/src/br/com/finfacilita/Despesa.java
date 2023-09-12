package br.com.finfacilita;

import java.util.Collection;
import java.util.Date;

public class Despesa extends TransacaoCadastrada {
	
	//SUB-CLASSE DESPESA
	
	//ATRIBUTOS SUB-CLASSE DESPESA



	private boolean despesaFixa;

	private boolean novoDespesaFixa;

	private Collection<Usuario> usuario;

	private Collection<PoderCompraOuInvestimento> poderCompraOuInvestimento;
	
	//CONSTRUTORES SUB-CLASSE DESPESA
	public Despesa(String nome, double valor, Date data, int tipoTransacao, String novoNome, double novoValor,
			Date novoData) {
		super(nome, valor, data, tipoTransacao, novoNome, novoValor, novoData);
	}
	
	//MÉTODOS SUB-CLASSE DESPESA

	@Override
	protected void cadastrarTransacao(String nome, double valor, Date data, int tipoTransacao) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void alterarTransacao(String nome, String novoNome, double valorNovo, Date dataNovo) {
		// TODO Auto-generated method stub
		
	}

	public void cadastrarTransacao(String nome, double valor, Date data, int tipoTransacao, boolean despesaFixa) {

	}

	public void alterarTransacao(String nome, String novoNome, double novoValor, Date novoData, boolean novoDespesaFixa) {

	}

	public void excluirTransacao(String nome, int tipoTransacao) {

	}

	//GETTERS SUB-CLASSE DESPESA
	public boolean isDespesaFixa() {
		return despesaFixa;
	}

	//SETTERS SUB-CLASSE DESPESA
	public void setDespesaFixa(boolean despesaFixa) {
		this.despesaFixa = despesaFixa;
	}

	
	

	

}
