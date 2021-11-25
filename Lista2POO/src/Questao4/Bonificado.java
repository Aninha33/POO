package Questao4;

public class Bonificado extends Salariado {
	
	private float bonificacao;

	public Bonificado(String n,String s,
			float base,float boni,float sm) {
		super(n,s,base,sm);
		this.bonificacao = boni; 
	}
	
	public void imprimir() {
		System.out.println("Nome: "+getNome()+" "+getSobrenome()+"\nGanho Total: "+getGanhoTotal());
	}
	public void ganhos() {
		
		setGanhoTotal(getSalarioBase() + getSalarioSemanal() * 4 + this.bonificacao);
	}
}
