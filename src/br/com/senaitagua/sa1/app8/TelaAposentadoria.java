package br.com.senaitagua.sa1.app8;

import java.awt.FlowLayout;

import javax.swing.*; // importa o pacote swing 

public class TelaAposentadoria extends JFrame{ // heran�a da clase JFrame
	
	JLabel titulo; // componente swing - cria um t�tulo
	JButton btnGravar, btnLer, btnLimpar; // cria um bot�o.
	JTextArea txtArea; // cria uma �rea ("caixa") maior para textos.
	
	public TelaAposentadoria() {// Construtor da classe
		super("Aplicativo 8");// faz refer�ncia � classe pai.
		
		getContentPane() .setLayout(new FlowLayout());
		
		// instancia��o do objeto "t�tulo":
		titulo = new JLabel ("aplicativo 8 - Aposentadoria do Piloto");
		
		// instacia��o dos bot�es:
		btnGravar = new JButton ("Gravar");
		btnLer = new JButton ("Ler");
		btnLimpar = new JButton ("Limpar");
		
		//instancia��o da �rea de texto:
		txtArea = new JTextArea(5, 10);// linha e coluna;
		
		getContentPane() .add(titulo);
		getContentPane() .add(txtArea);
		getContentPane() .add(btnGravar);
		getContentPane() .add(btnLer);
		getContentPane() .add(btnLimpar);
		
		setSize(800, 600);
	}

}
