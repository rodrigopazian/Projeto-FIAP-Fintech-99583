package br.com.finfacilita;

import java.util.Collection;
import java.util.Date;

public class Objetivo extends TransacaoCadastrada {
	
	//SUB-CLASSE OBJETIVO
	
	//ATRIBUTOS SUB-CLASSE OBJETIVO


	private double vlRealidadeTendencia;

	private Collection<Usuario> usuario;
	
	//CONSTRUTORES SUB-CLASSE OBJETIVO
	public Objetivo(String nome, double valor, Date data, int tipoTransacao, String novoNome, double novoValor,
			Date novoData) {
		super(nome, valor, data, tipoTransacao, novoNome, novoValor, novoData);
	}
	
	//METODOS SUB-CLASSE OBJETIVO

	public void cadastrarTransacao(String nome, double valor, Date data, int tipoTransacao) {

	}

	public void alterarTransacao(String nome, String novoNome, double novoValor, Date novoData) {

	}

	public void excluirTransacao(String nome, int tipoTransacao) {

	}

	//GETTERS SUB-CLASSE OBJETIVO
	public double getVlRealidadeTendencia() {
		return vlRealidadeTendencia;
	}

	//SETTERS SUB-CLASSE OBJETIVO
	public void setVlRealidadeTendencia(double vlRealidadeTendencia) {
		this.vlRealidadeTendencia = vlRealidadeTendencia;
	}
	

	

}
