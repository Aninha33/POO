package Questao2;

public class Professor extends MembroUniversidade {
	
	public Professor(float s) {
		super(s);
	}

	public void pagamento() {
		System.out.println(toString());
	}
	
	public String toString() {
		return "O salario eh: "+this.salario;
	}


}
