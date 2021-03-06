package Questao5;

public class Soma implements IOperacoes{

		protected static int instancias = 0;
		private float operando1;
		private float operando2;
		private float resultado;
		
		public Soma() {
			Soma.instancias++;
		}
		
		public void setOperando1(float operando1) {
			this.operando1 = operando1;
		}
		
		public void setOperando2(float operando2) {
			this.operando2 = operando2;
		}
		
		public float getResultado() {
			this.resultado = this.operando1 + this.operando2;
			return this.resultado;
		}
		
		public String getNome() {
			return "Soma";
		}
		
		public int getQuantidade() {
			return Soma.instancias;
		}
		public String toString() {
			return "Nome: "+getNome()+", Resultado: "+getResultado()+", Instancias: "+getQuantidade()+"\n";
		}


}
