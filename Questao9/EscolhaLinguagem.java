package Questao9;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EscolhaLinguagem extends JFrame{

	private JRadioButton java, c, sim, nao;
	private JLabel pergunta, pergunta2;
	private ButtonGroup opcao1, opcao2;
	private RadioButtonAltera altera;
	
	public EscolhaLinguagem(){
		super("Radio Buttons - JavaProgressivo.net");
		setLayout( new FlowLayout() );
		altera = new RadioButtonAltera();
		
		pergunta = new JLabel("Qual a melhor linguagem de programação?");
		pergunta2 = new JLabel("\nVocê realmente tem certeza disso?");
		java = new JRadioButton("Java", false);
		c = new JRadioButton("C", false);
		sim = new JRadioButton("Sim", false);
		nao = new JRadioButton("Não", false);
		
		add(pergunta);
		add(java);
		add(c);
		add(pergunta2);
		add(sim);
		add(nao);
		
		opcao1 = new ButtonGroup();
		opcao1.add(java);
		opcao1.add(c);
		
		opcao2 = new ButtonGroup();
		opcao2.add(sim);
		opcao2.add(nao);
		
		java.addItemListener(altera);
		c.addItemListener(altera);
		sim.addItemListener(altera);
		nao.addItemListener(altera);
	}//construtor
		
	private class RadioButtonAltera implements ItemListener{
		public void itemStateChanged(ItemEvent event) {
			if(java.isSelected() && sim.isSelected())
			 JOptionPane.showMessageDialog(null,"Parabéns, você é o cara", "Acertou! ", JOptionPane.PLAIN_MESSAGE);
			if(c.isSelected() && sim.isSelected())
			 JOptionPane.showMessageDialog(null,"Sabe de nada, inocente!","Errou! ", JOptionPane.ERROR_MESSAGE); 
		}//resposta	
	}//RadioButtonAltera
}//RadioButtonAltera