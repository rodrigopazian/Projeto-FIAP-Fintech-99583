package br.com.finfacilita;

import java.util.Collection;
import java.util.Date;

public class Receita extends TransacaoCadastrada {

	private boolean receitaFixa;

	private boolean novoReceitaFixa;

	private Collection<Usuario> usuario;

	private Collection<PoderCompraOuInvestimento> poderCompraOuInvestimento;

	public void cadastrarTransacao(String nome, double valor, Date data, int tipoTransacao, boolean receitaFixa) {

	}

	public void alterarTransacao(String nome, String novoNome, double novoValor, Date novoData, boolean novoReceitaFixa) {

	}

	public void excluirTransacao(String nome, int tipoTransacao) {

	}

	@Override
	protected void cadastrarTransacao(String nome, double valor, Date data, int tipoTransacao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void alterarTransacao(String nome, String novoNome, double valorNovo, Date dataNovo) {
		// TODO Auto-generated method stub
		
	}

}
