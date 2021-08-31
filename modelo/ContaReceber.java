package com.algaworks.sistemaV2.modelo;

public class ContaReceber extends Conta {

	Cliente cliente;

	public ContaReceber(){}
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public void receber() {

	}

	public void cancelar() {
		if (valor <= 50000) {
			if (situacao.equals(SituacaoConta.PENDENTE)) {
				situacao = SituacaoConta.CANCELADA;
				System.out.println("Conta " + descricao + " cancelada com sucesso.");
			} else {
				System.out.println("Não foi possível cancelar a conta \"" + descricao + "\", pois essa não estava pendente.");
			}
		}
		else {
			System.out.println("Não foi possível cancelar a conta \"" + descricao + "\", pois seu valor é superior a R$50.000,00.");
		}
			
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
