package com.algaworks.sistemaV4.modelo;

import com.algaworks.sistemaV4.excecoes.SituacaoInvalidaException;

public abstract class Conta {

	private String descricao;
	private Double valor;
	private String dataVencimento;
	protected SituacaoConta situacao;

	public Conta() {
		situacao = SituacaoConta.PENDENTE;
	}

	public void cancelar() throws SituacaoInvalidaException {
		if (SituacaoConta.PENDENTE.equals(getSituacao())) {
			situacao = SituacaoConta.CANCELADA;
			System.out.println("Conta \"" + descricao + "\" cancelada com sucesso.");
		} else {
			String mensagem = "Não foi possível cancelar a conta \"" + descricao + "\", pois essa não estava pendente.";
			throw new SituacaoInvalidaException(mensagem);
		}
	}

	public abstract String toString();

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public SituacaoConta getSituacao() {
		return situacao;
	}

}
