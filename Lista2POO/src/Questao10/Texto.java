package Questao10;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Texto extends JFrame implements ActionListener {
	private static final Texto t = new Texto();
	
	private JLabel mensagem;
	private JTextField campoTexto;
	private JButton botaoNegrito = new JButton("Negrito");
	private JButton botaoItalico = new JButton("Italico");
	private JButton botaoSair = new JButton("Sair");
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource() == botaoNegrito) {
	    	campoTexto.setFont(new Font("Arial", Font.BOLD, 12));
	 
		 } else if(e.getSource() == botaoItalico) {
	    	campoTexto.setFont(new Font("Arial", Font.ITALIC, 12));
	  
		 }else if(e.getSource() == botaoSair) {
		    	System.exit(1);
		 }//else
			  
	}//actionPerfomed

	private Texto() {

		super("Mudança de Formatação de Texto ");
		setLayout(null);
	
		mensagem = new JLabel("Digite a mensagem ao qual quer Formatar ");
		add(mensagem);
		mensagem.setBounds(50,10,300,50); 
	
		campoTexto = new JTextField(10); 
		campoTexto.setFont(new Font("Arial", Font.PLAIN, 12)); 
		add(campoTexto);
		campoTexto.setBounds(50,50,300,20); 
		
		botaoNegrito.addActionListener(this);
		botaoItalico.addActionListener(this);
		botaoSair.addActionListener(this);
		botaoNegrito.setBounds(150,100,100,20); 
		botaoItalico.setBounds(150,150,100,20); 
		botaoSair.setBounds(150,200,100,20); 
		
		add(botaoNegrito);
		add(botaoItalico);
		add(botaoSair);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(400,300);
    	setVisible(true);	
        setLocationRelativeTo(null);
	}//construtor
	

	public static Texto getTexto() {
		return t;
	}//getTexto

}//Texto
