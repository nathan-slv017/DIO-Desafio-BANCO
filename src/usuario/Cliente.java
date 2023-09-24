package usuario;

import funcionalidadesInternas.Conta;
import funcionalidadesInternas.ContaCorrente;
import funcionalidadesInternas.ContaPoupança;

public class Cliente {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupança();

		cc.depositar(1000);
		cc.transferir(cp, 200);

		cc.imprimirExtrato();
		cp.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
