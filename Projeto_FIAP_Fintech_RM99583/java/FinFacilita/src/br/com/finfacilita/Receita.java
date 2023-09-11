package br.com.finfacilita;

import java.util.Date;
import java.util.Collection;

public class Receita {

	private String nmReceita;

	private double vlReceita;

	private Date dtRecebimento;

	private boolean receitaFixa;

	private Collection<Usuario> usuario;

	private Collection<PoderCompraOuInvestimento> poderCompraOuInvestimento;

	public void cadastrarReceita(String nmReceita, double vlReceita, Date dtRecebimento, boolean receitaFixa) {

	}

	public void excluirReceita(String nmReceita) {

	}

	public void alterarReceita(String nmReceitaAtual, String nmReceitaNovo, double vlReceitaNovo, Date dtRecebimentoNovo, boolean receitaFixaNovo) {

	}

}
