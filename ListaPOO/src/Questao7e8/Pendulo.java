package Questao7e8;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Pendulo {
	
	private int A;
	private int B;
	private int C;
	
	public Pendulo(int A, int B, int C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}//construtor pendulo

	public void oscilar() {
		
	    final JDialog dialog = new JDialog();
		
	    do {
			C += 1;
			
	        if(this.C >= 30) {
	        	this.B += 1;
	            this.C = 0;
	            dialog.setVisible(false); //vai fechar o painel
	        }//if preencher B
	        
	        if(this.B >= 30) {
	            this.A += 1;
	            this.B = 0;
	            dialog.setVisible(false); //vai fechar o painel
	        }//if preencher A		

	        
	        //mensagem no painelzin bunitin
	        JOptionPane optionPane = new JOptionPane("A = " + this.A + ": B = " + this.B + " : C = "+ this.C 
	                , JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
	        //configurações da caixinha de dialogo
	        dialog.setTitle("Pendulando"); //titulo da mensagem
	        dialog.setContentPane(optionPane); //corpinho do painel
	        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE); //não deixa fechar com o X
	        dialog.pack(); //corpinho do painel
	        dialog.setLocation(550, 300); //localização que o painelzinho vai aparecer 
	        dialog.setVisible(true); //deixar visivel o painel
	
	        try { 
	              Thread.sleep(100); //tempo até mudar o painel
	        } catch (InterruptedException ex) {
	                 System.out.println ("Erro!");
	        }//catch
		}while (this.A != 30);
	}//oscilar
}//Pendulo
