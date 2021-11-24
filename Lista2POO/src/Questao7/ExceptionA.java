package Questao7;

public class ExceptionA extends Exception {

	public ExceptionA() {
		super("\n ERRO - Exception A = 0! " );
	}
	
	public ExceptionA(String m){
		super(m);
	}
	
}//ExceptionA
