package Questao4;

public abstract class Empregado {
	
	private String nome;
	private String sobrenome;
	private float salarioBase;
	private float ganhoTotal;
	
	public abstract void imprimir();
	public abstract void ganhos();
	
	public Empregado(String n,String s,float base) {
		this.nome = n;
		this.sobrenome = s;
		this.salarioBase = base;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public float getSalarioBase() {
		return this.salarioBase;
	}
	public float getGanhoTotal(){
		return ganhoTotal;
		
	}
	public void setGanhoTotal(float ganho) {
		this.ganhoTotal = ganho;
	}
}
