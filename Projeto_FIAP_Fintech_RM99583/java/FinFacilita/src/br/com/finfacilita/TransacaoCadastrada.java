package br.com.finfacilita;

import java.util.Date;

public abstract class TransacaoCadastrada {

	protected String nome;

	protected double valor;

	protected Date data;

	protected int tipoTransacao;

	protected String novoNome;

	protected double novoValor;

	protected Date novoData;

	private Usuario usuario;

	protected abstract void cadastrarTransacao(String nome, double valor, Date data, int tipoTransacao);

	protected abstract void excluirTransacao(String nome, int tipoTransacao);

	protected abstract void alterarTransacao(String nome, String novoNome, double valorNovo, Date dataNovo);

}
