package Questao8;

import javax.swing.JOptionPane;
import java.util.Random;

public class Principal{
	
	public static void main(String[] args) {
			
	    Random random = new Random();
	    int indice = random.nextInt(13);
		
		String msg = JOptionPane.showInputDialog("Tente acertar um número de 0 a 13! Digite sua aposta:");		
		int numero = Integer.parseInt(msg);
			
		if(numero == indice) {
			JOptionPane.showMessageDialog(null, "Parabens! Você Acertou, o numero " + numero + " foi o sorteado", 
					"Acertou! ", JOptionPane.PLAIN_MESSAGE); 
		}else {
			JOptionPane.showMessageDialog(null, "Que pena! Você NÃO Acertou, o numero sorteado foi o " + indice, 
					"Errou! ", JOptionPane.ERROR_MESSAGE); 
		}//else resposta
	}//Main
}//Principal
