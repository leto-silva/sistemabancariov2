package domain;

public class Banco {
	private String codigoBanco;
	private String nomeBanco;
	
	public Banco(String codigoBanco, String nomeBanco) {
		this.codigoBanco = codigoBanco;
		this.nomeBanco = nomeBanco;
	}

	public String getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(String codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
}
