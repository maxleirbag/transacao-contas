package com.algaworks.sistemaV4.modelo;

import com.algaworks.sistemaV4.excecoes.SituacaoInvalidaException;

public class ContaReceber extends Conta {

	Cliente cliente;

	public ContaReceber() {
	}

	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public void receber() throws SituacaoInvalidaException {
		if (SituacaoConta.PENDENTE.equals(getSituacao())) {
			this.situacao = SituacaoConta.PAGA;
			System.out.printf("Recebendo conta %s no valor de %.2f e vencimento em %s" + ",%ndo cliente %s.%n",
					this.getDescricao(), this.getValor(), this.getDataVencimento(), this.getCliente().getNome());
		} else {
			String mensagem = "Não foi possível receber a conta \"" + getDescricao()
					+ "\", \npois seu status não era Pendente.";
			throw new SituacaoInvalidaException(mensagem);
		}
	}

	public void cancelar() throws SituacaoInvalidaException {
		if (this.getValor() <= 50000) {
			try {
				super.cancelar();
			} catch (SituacaoInvalidaException erroSituacao) {
				erroSituacao.getMessage();
			}
		} else {
			System.out.println("Não foi possível cancelar a conta \"" + getDescricao()
					+ "\", \npois seu valor é superior a R$50.000,00.");
		}

	}

	@Override
	public String toString() {
		return "ContaReceber [cliente=" + cliente.getNome() + ", descricao=" + getDescricao() + ", valor=" + getValor()
				+ ", dataVencimento=" + getDataVencimento() + ", situacao=" + situacao + "]";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
