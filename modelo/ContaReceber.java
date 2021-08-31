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
		if (SituacaoConta.PENDENTE.equals(this.getSituacao())){
			this.situacao = SituacaoConta.PAGA;
			System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " 
				+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
				+ " do cliente " + this.getCliente().getNome() + ".");
		}
		else{
			System.out.println("Não foi possível receber a conta \"" + descricao + "\", pois seu status não era Pendente.");
		}
	}

	public void cancelar() {
		if (this.getValor() <= 50000) {
			super.cancelar();
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
