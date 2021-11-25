package Questao3;

public class Real implements IConversorMoeda {

	private int rankdamoeda;
	private String nome;
	private float quantidade;
	
	public Real(String n,float q,int r) {
		setMoeda(n,q);
		setRank(r);
	}
	
	public float getCarteira() {
		return this.rankdamoeda;
	}
	public void setRank(int rank) {
		this.rankdamoeda = rank;
	}
	public void setMoeda(String n,float q) {
		this.nome = n;
		this.quantidade = q;
	}
	public float getConversaoDolar() {
		System.out.println("Quanto equivale "+quantidade +" "+nome + " em dolar:");
		return (0.18f * quantidade);
	}

}
