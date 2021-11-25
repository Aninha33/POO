package Questao3;

public class Euro implements IConversorMoeda {
	
	private String paisOrigem;
	private String nome;
	private float quantidade;
	
	public Euro(String n,float q,String pais) {
		setMoeda(n,q);
		setpaisOrigem(pais);
	}

	public String getPaisOrigem() {
		return this.paisOrigem;
	}
	public void setpaisOrigem(String p) {
		this.paisOrigem = p;
	}
	public void setMoeda(String n,float q) {
		this.nome = n;
		this.quantidade = q;
	}
	public float getConversaoDolar() {
		System.out.println("Quanto equivale "+quantidade +" "+nome + " em dolar:");
		return (1.12f * quantidade);
	}
}
