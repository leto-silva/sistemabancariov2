package domain;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Banco banco, String numero, double valor) {
		super(banco, numero, valor);
		this.TipoConta="Poupança";
	}
	
}
