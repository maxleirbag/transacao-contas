package com.algaworks.sistemaV2.modelo;

public class ContaPagar extends Conta {

	Fornecedor fornecedor;
	
	public ContaPagar(){}

	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void pagar() {
		if (situacao.equals(SituacaoConta.PENDENTE)) {
			situacao = SituacaoConta.PAGA;
			System.out.println("Conta \"" + descricao + "\" paga com sucesso.");
		} else {
			System.out.println("Não foi possível paga a conta \"" + descricao + "\", pois essa não estava pendente.");
		}
	}
	

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
