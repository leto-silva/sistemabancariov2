package domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
	protected String numero;
	protected String TipoConta;
	protected double saldo;
	private Banco banco;
	private List<String> listExtrato;
	
	public Conta(Banco banco, String numero, double valor) {
		this.banco = banco;
		this.numero = numero;
		this.TipoConta="";
		this.listExtrato = new ArrayList<>();
		this.deposito(valor);
	}
    
	public void saque(double valor) {
		this.saldo -= valor;
		this.listExtrato.add("Saque        :" + String.valueOf(valor) + "  ->Saldo Atual: " + String.valueOf(saldo));
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
		this.listExtrato.add("Deposito     :" + String.valueOf(valor) + "  ->Saldo Atual: " + String.valueOf(saldo) );
	}
	
	public void transferencia(Conta contaDestino, double valor) {
		this.saque(valor);
		contaDestino.deposito(valor);
		this.listExtrato.add("Tranferência :" + String.valueOf(valor) + "   Destino: " +
		contaDestino.banco.getCodigoBanco() + "|"+ contaDestino.banco.getNomeBanco());
	}
	
	public void impressaoInformacoes() {
		System.out.println("----------------------");
		System.out.println(this.banco.getCodigoBanco());
		System.out.println(this.banco.getNomeBanco());
		System.out.println(this.TipoConta + " " + this.getNumero());
		System.out.println("----------------------");						
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public List<String> getListExtrato() {
		return listExtrato;
	}

	public void setListExtrato(List<String> listExtrato) {
		this.listExtrato = listExtrato;
	}
	
	public void impressaoSaldo() {
		System.out.println("Saldo Atual  :" + this.getSaldo());
	};
	
	public void impressaoExtrato() {
		impressaoInformacoes();		
		System.out.println("----------------------");
		for (String e : this.getListExtrato()) {
			System.out.println(e);		
		}
		this.impressaoSaldo();		
	};
	
}
