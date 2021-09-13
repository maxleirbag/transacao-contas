package com.algaworks.sistemaV4;

import com.algaworks.sistemaV4.modelo.Conta;

public class RelatorioContas {

	void detalharContas(Conta[] contas) {

		for (int i = 0; i < contas.length; i++) {
			System.out.println(contas[i].toString());
		}

	}
}
