package Questao4;

public class Comissionado extends Empregado {

	private float taxaComissao;
	private float vendas;
	
	public Comissionado(String n,String s,float base,float tx,float vendas) {
		super(n,s,base);
		this.taxaComissao = tx;	
		this.vendas = vendas;
	}
	public void imprimir() {
		System.out.println("Nome: "+getNome()+" "+getSobrenome()+"\nGanho Total: "+getGanhoTotal());
	}
	public void ganhos() {
		
		setGanhoTotal(getSalarioBase() + taxaComissao * vendas );
	}
}
