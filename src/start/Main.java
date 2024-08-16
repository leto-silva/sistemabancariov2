package start;

import domain.Banco;
import domain.Conta;
import domain.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		ContaPoupanca contaPoupanca = new ContaPoupanca(new Banco("0237", "Bradesco"),"1255-63", 1000.00);
		
		ContaCorrente contaCorrente = new ContaCorrente(new Banco("0237", "Bradesco"),"1255-63", 1000.00, 0.5d);
		contaCorrente.calcRendimento();
		
		impressao(contaCorrente);
		
	}
	
	public static void impressao(Conta c) {
		c.impressaoExtrato();
	}

}
