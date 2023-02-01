package br.com.senaitagua.sa1.app8;

import java.awt.FlowLayout;

import javax.swing.*; // importa o pacote swing 

public class TelaAposentadoria extends JFrame{ // herança da clase JFrame
	
	JLabel titulo; // componente swing - cria um título
	JButton btnGravar, btnLer, btnLimpar; // cria um botão.
	JTextArea txtArea; // cria uma área ("caixa") maior para textos.
	
	public TelaAposentadoria() {// Construtor da classe
		super("Aplicativo 8");// faz referência à classe pai.
		
		getContentPane() .setLayout(new FlowLayout());
		
		// instanciação do objeto "título":
		titulo = new JLabel ("aplicativo 8 - Aposentadoria do Piloto");
		
		// instaciação dos botões:
		btnGravar = new JButton ("Gravar");
		btnLer = new JButton ("Ler");
		btnLimpar = new JButton ("Limpar");
		
		//instanciação da área de texto:
		txtArea = new JTextArea(5, 10);// linha e coluna;
		
		getContentPane() .add(titulo);
		getContentPane() .add(txtArea);
		getContentPane() .add(btnGravar);
		getContentPane() .add(btnLer);
		getContentPane() .add(btnLimpar);
		
		setSize(800, 600);
	}

}
