package br.com.finfacilita;

import java.util.Date;

public abstract class TransacaoCadastrada {

	
	//CLASSE ABSTRATA TRANSACAOCADASTRADA

	
	//ATRIBUTOS CLASSE TRANSACAOCADASTRADA

	protected String nome;

	protected double valor;

	protected Date data;

	protected int tipoTransacao;

	public TransacaoCadastrada(String nome, double valor, Date data, int tipoTransacao, String novoNome,
			double novoValor, Date novoData) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.data = data;
		this.tipoTransacao = tipoTransacao;
		this.novoNome = novoNome;
		this.novoValor = novoValor;
		this.novoData = novoData;
	}

	protected String novoNome;

	protected double novoValor;

	protected Date novoData;

	private Usuario usuario;

	
	//CONSTRUTORES CLASSE TRANSACAOCADASTRADA
	

	
	//MÉTODOS ABSTRATOS CLASSE TRANSACAOCADASTRADA

	protected abstract void cadastrarTransacao(String nome, double valor, Date data, int tipoTransacao);

	protected abstract void excluirTransacao(String nome, int tipoTransacao);

	protected abstract void alterarTransacao(String nome, String novoNome, double valorNovo, Date dataNovo);


	
	
	//GETTERS CLASSE TRANSACAOCADASTRADA
	
	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public Date getData() {
		return data;
	}

	public int getTipoTransacao() {
		return tipoTransacao;
	}

	public String getNovoNome() {
		return novoNome;
	}

	public double getNovoValor() {
		return novoValor;
	}

	public Date getNovoData() {
		return novoData;
	}


		
	//SETTERS CLASSE TRANSACAOCADASTRADA
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setTipoTransacao(int tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public void setNovoNome(String novoNome) {
		this.novoNome = novoNome;
	}

	public void setNovoValor(double novoValor) {
		this.novoValor = novoValor;
	}

	public void setNovoData(Date novoData) {
		this.novoData = novoData;
	}

	


	

}
