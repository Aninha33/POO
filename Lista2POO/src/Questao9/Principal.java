package Questao9;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Iterator;


public class Principal  extends JFrame {

	private JRadioButton Laranja, Kiwi, Morango, Maca, sim, nao;
	private JLabel pergunta, pergunta2;
	private ButtonGroup opcao1, opcao2;
	private RadioButtonAltera altera;
	
    public Principal() {
    	 super("Frutaria");
    	 setLayout( new FlowLayout() );
    	 altera = new RadioButtonAltera();
 		
    	 
    	 pergunta = new JLabel("Escolha a fruta que quer consultar o preço: ");
 		 pergunta2 = new JLabel(" Você realmente tem certeza disso? ");
 		
    	 Maca = new JRadioButton(" Maca ", false);
    	 Laranja = new JRadioButton("Laranja ", false);
    	 Morango = new JRadioButton(" Morango", false);
    	 Kiwi = new JRadioButton(" Kiwi ", false);
    	 
    	 sim = new JRadioButton(" Sim ", false);
    	 nao = new JRadioButton(" Não", false);
    	  		 
    	 
    	 ArrayList<JRadioButton> lista = new ArrayList<JRadioButton>();    
    	
    	 add(pergunta);
    	 
         lista.add(Maca);
         lista.add(Kiwi);
         lista.add(Morango);
         lista.add(Laranja);
      
         
		 opcao1 = new ButtonGroup();		 
		 opcao1.add(Morango);
		 opcao1.add(Laranja);
		 opcao1.add(Kiwi);
		 opcao1.add(Maca);
		 
		 opcao2 = new ButtonGroup();
		 opcao2.add(sim);
		 opcao2.add(nao);
			
		 Maca.addItemListener(altera);
		 Morango.addItemListener(altera);
		 Kiwi.addItemListener(altera);
		 Laranja.addItemListener(altera);
		 sim.addItemListener(altera);
		 nao.addItemListener(altera);

		 
		 Iterator <JRadioButton> iRadio = lista.iterator();
	
			
     	 while (iRadio.hasNext()) {
     		add((JRadioButton)iRadio.next());
       	}//while
     	
     	add(pergunta2);
        add(sim);
        add(nao);
        
    }//construtor
    
    private class RadioButtonAltera implements ItemListener{
		public void itemStateChanged(ItemEvent event) {
			if(Kiwi.isSelected() && sim.isSelected()) {
				JOptionPane.showMessageDialog(null,"O Kiwi está em promoção! \n Está pelo valor : 10.90 Kg","Promoção! ", JOptionPane.PLAIN_MESSAGE); 
				System.exit(1);
			}//if
			if(Maca.isSelected() && sim.isSelected()) {
			 JOptionPane.showMessageDialog(null,"A Maçã está em promoção! \n Está pelo valor : 3.90 Kg","Promoção! ", JOptionPane.PLAIN_MESSAGE); 
			 System.exit(1);
			}//if
			if(Laranja.isSelected() && sim.isSelected()) {
				 JOptionPane.showMessageDialog(null,"A Laranja está em promoção! \n Está pelo valor : 1.90 Kg","Promoção! ", JOptionPane.PLAIN_MESSAGE); 
				 System.exit(1);
			}//if
			if(Morango.isSelected() && sim.isSelected()) {
				 JOptionPane.showMessageDialog(null,"O Morango está em promoção! \n Está pelo valor : 8.50 Kg","Promoção! ", JOptionPane.PLAIN_MESSAGE); 
				 System.exit(1);
			}//if
		}//resposta	
	}//RadioButtonAltera
    
    public static void main (String args[ ]){
        Principal p = new Principal();
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		p.setSize(300,260);
 		p.setVisible(true);
        p.setLocation(550,250);
    }//main
}// Principal