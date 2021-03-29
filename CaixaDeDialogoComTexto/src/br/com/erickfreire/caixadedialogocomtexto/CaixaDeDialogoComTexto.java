package br.com.erickfreire.caixadedialogocomtexto;

import javax.swing.JOptionPane;

public class CaixaDeDialogoComTexto {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual o seu nome? ");
		
		String mensagem = String.format("%s, Bem vindo ao curso de Java!", nome);
		
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
