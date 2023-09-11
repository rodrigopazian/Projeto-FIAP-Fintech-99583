package br.com.finfacilita;

import java.util.Date;
import java.util.Collection;

public class Despesa {

	private String nmDespesa;

	private double vlDespesa;

	private Date dtCobrancaDespesa;

	private boolean despesaFixa;

	private Collection<Usuario> usuario;

	private Collection<PoderCompraOuInvestimento> poderCompraOuInvestimento;

	public void cadastrarDespesa(String nmDespesa, double vlDespesa, Date dtCobrancaDespesa, boolean despesaFixa) {

	}

	public void excluirDespesa(String nmDespesa) {

	}

	public void alterarDespesa(String nmDespesaAtual, String nmDespesaNovo, double vlDespesaNovo, Date dtCobrancaDespesaNovo, boolean despesaFixaNovo) {

	}

}
