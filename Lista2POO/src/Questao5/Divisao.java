package Questao5;

public class Divisao implements IOperacoes{

	protected static int instancias = 0;
	private float operando1;
	private float operando2;
	private float resultado;
	
	public Divisao() {
		Divisao.instancias++;
	}
	
	public float divisor(float n, float d) throws ArithmeticException {
			float resultado=0;
			if (d==0)
				throw new ArithmeticException();
			else
				resultado=(float)n/d;
				
			return resultado;
		}

	public void setOperando1(float operando1) {
		this.operando1 = operando1;
	}
	
	public void setOperando2(float operando2) {
		this.operando2 = operando2;
	}
	
	public float getResultado() {
		resultado = 0;
		  try {		
			  resultado = divisor(operando1,operando2);
	        } catch ( ArithmeticException  e ){
	                  System.out.println("Excecao: divisao por zero: " + e.getMessage() );
	                  e.printStackTrace();
	        }

		return this.resultado;
	}
	
	public String getNome() {
		return "Divisao";
	}
	
	public int getQuantidade() {
		return Divisao.instancias;
	}
	
	public String toString() {
		return "Nome: "+getNome()+", Resultado: "+getResultado()+", Instancias: "+getQuantidade()+"\n";
	}
	
}
