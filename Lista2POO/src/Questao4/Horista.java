package Questao4;

public class Horista extends Empregado {
	
	private int horas;
	private float valorhora;

	public Horista(String n,String s,float base,int h,float valorhora) {
		super(n,s,base);
		this.horas = h;
		this.valorhora = valorhora;
	}
	public void imprimir() {
		System.out.println("Nome: "+getNome()+" "+getSobrenome()+"\nGanho Total: "+getGanhoTotal());
	}
	public void ganhos() {
		
		setGanhoTotal(getSalarioBase() + (float)(valorhora * horas) );
	}

}
