package br.com.generation.projeto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Projeto {

	public static void main(String[] args) {

		String m1 = null;

		int opcao1, opcao2;

		m1 = JOptionPane.showInputDialog("Digite o nome da Protagonista para iniciar o jogo interativo");

		JOptionPane.showMessageDialog(null, m1 + " acordou para ir ao trabalho.");

		opcao1 = Integer.parseInt(JOptionPane.showInputDialog("Agora vamos come�ar com as escolhas:\n1 - Acordou na hora | 2 - Acordou atrasada"));

		if (opcao1 == 1) {
			
			JOptionPane.showMessageDialog(null, m1 + " se arruma, sai de casa e dirige at� o trabalho. No estacionamento acidentalmente encosta no carro de um funcion�rio que estava chegando");
		}

		else if (opcao1 == 2) {
			JOptionPane.showMessageDialog(null, m1 + " ficou preocupada em se atrasar para o trabalho, ent�o, colocou rapidamente um"+ " shorts e uma blusa que encontrou e resolveu se trocar no trabalho.");
		}

		else {
			System.out.println("Op��o inv�lida");
		}

		JOptionPane.showMessageDialog(null, "Escolha a op��o a seguir");
		
		opcao2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Os dois desceram do carro e se acertaram sobre o problema acontecido, " + m1 + " deu" + " seu n�mero e se prontificou a chamar o seguro.\n\n" + "O outro funcion�rio a tranquilizou dizendo: acidentes acontecem!\n\n" + "2 - O funcion�rio sai do carro bravo," + m1 + " Dizendo as seguintes palavra: tinha que ser mulher para n�o saber dirigir!\n\n" + m1 + " sentiu medo por trabalhar no mesmo local que este homem, tamb�m se sentiu frustrada " + "por ter cometido esse deslize."));
		
		
	}

}
