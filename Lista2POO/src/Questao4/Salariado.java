package Questao4;

public abstract class Salariado extends Empregado {
	
	private float salarioSemanal;
	
	public Salariado(String n,String s,float base, float sm) {
		super(n,s,base);
		this.salarioSemanal = sm;
	}
	
	public float getSalarioSemanal() {
		return this.salarioSemanal;
	}

}
