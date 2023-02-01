package br.com.senaitagua.sa1.app8;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.Piloto;

public class Principal {

	public static void main(String[] args) {
		
		Piloto p = new Piloto();
		
		p.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual seu nome: ")));
		
		if (p.verificarAposentadoria()) {
			new TelaAposentadoria() .setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "Você não possui idade suficiente!", "Aplicativo 8", JOptionPane.ERROR_MESSAGE);
		}

	}

}
