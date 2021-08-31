package com.algaworks.sistemaV2.modelo;

public class Conta {
	
	String descricao;
	Double valor;
	String dataVencimento;
	SituacaoConta situacao;
	
	Conta(){ 
		situacao = SituacaoConta.PENDENTE;
	}
	
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
	
	public void cancelar(){
		
	}	
	
}
