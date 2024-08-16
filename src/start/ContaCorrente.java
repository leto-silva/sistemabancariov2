package start;

import domain.Banco;
import domain.Conta;

public class ContaCorrente extends Conta {
	private double percentualRendimento;

	public ContaCorrente(Banco banco, String numero, double valor, double percentualRendimento) {
		super(banco, numero, valor);
		this.TipoConta ="Conta Corrente";
		this.percentualRendimento = percentualRendimento;
	}
	
	public void calcRendimento() {
		System.out.println("Calculando rendimeto: " + this.percentualRendimento);
		this.saldo = saldo + (saldo * this.percentualRendimento); 
	}

	@Override
	public void impressaoExtrato() {
		super.impressaoInformacoes();

		System.out.println("----------------------");
		for (String e : this.getListExtrato()) {
			System.out.println(e);		
		}
		this.impressaoSaldo();
	}
	
}
