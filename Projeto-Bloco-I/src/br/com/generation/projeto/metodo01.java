package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class metodo01{

	public static void metodo02(String nome) {
		
		int opcao1;
		
		JOptionPane.showMessageDialog(null, "Escolha as op��o a seguir");

		opcao1 = Integer.parseInt(JOptionPane.showInputDialog("1 - Os dois desceram do carro e se acertaram sobre o problema acontecido, " + nome + " deu" + " seu n�mero e se prontificou a chamar o seguro.\n\n" + "O outro funcion�rio a tranquilizou dizendo: acidentes acontecem!\n\n" + "2 - O funcion�rio sai do carro bravo," + nome + " Dizendo as seguintes palavra: tinha que ser mulher para n�o saber dirigir!\n\n" + nome + " sentiu medo por trabalhar no mesmo local que este homem, tamb�m se sentiu frustrada por ter cometido esse deslize."));

		JOptionPane.showMessageDialog(null, "Por conta do ocorrido " + nome + " acabou chegando atrasada para uma reuni�o, explicou toda a situa��o e por fim se desculpou pelo atraso.");
		
		opcao1 = Integer.parseInt(JOptionPane.showInputDialog("1 - A equipe entendeu o ocorrido, perguntando se estava tudo bem, e a reuni�o prosseguiu normalmente.\n2 - " + nome + " ouviu piadas de mau gosto sobre o ocorrido, sentiu-se constrangida, mas como j� havia se atrasado simplesmente sentou e aguardou a reuni�o prosseguir."));

		JOptionPane.showMessageDialog(null, "Ainda um pouco estressada ap�s o ocorrido no in�cio do dia " + nome + " optou por comer sozinha no refeit�rio, n�o estava com muita vontade de socializar.");

	}

}
