package Questao3;

public class BitCoin implements IConversorMoeda {
	
	private String tipodemoeda;
	private String nome;
	private float quantidade;
	
	public BitCoin(String n,float q,String tipo) {
		setMoeda(n,q);
		setTipodeMoeda(tipo);
	}

	public String getTipodeMorda() {
		return this.tipodemoeda;
	}
	public void setTipodeMoeda(String m) {
		this.tipodemoeda = m;
	}
	public void setMoeda(String n,float q) {
		this.nome = n;
		this.quantidade = q;
	}
	public float getConversaoDolar() {
		System.out.println("Quanto equivale "+quantidade +" "+nome + " em dolar:");
		return (56145.60f * quantidade);
	}
}
