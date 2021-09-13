package com.algaworks.sistemaV4.modelo;

import com.algaworks.sistemaV4.excecoes.SituacaoInvalidaException;

public class ContaPagar extends Conta {

	Fornecedor fornecedor;

	public ContaPagar() {
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public void pagar() throws SituacaoInvalidaException {
		if (situacao.equals(SituacaoConta.PENDENTE)) {
			situacao = SituacaoConta.PAGA;
			System.out.println("Conta \"" + getDescricao() + "\" paga com sucesso.");
		} else {
			String mensagem = "Não foi possível paga a conta \"" + getDescricao()
					+ "\", pois essa não estava pendente.";
			throw new SituacaoInvalidaException(mensagem);
		}
	}

	@Override
	public String toString() {
		return "ContaPagar [fornecedor=" + fornecedor.getNome() + ", descricao=" + getDescricao() + ", valor="
				+ getValor() + ", dataVencimento=" + getDataVencimento() + ", situacao=" + situacao + "]";
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
