package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class metodo02 {

	public static void metodo03(String nome) {
		
		int opcao2;
		
		JOptionPane.showMessageDialog(null, "Escolha as op��o a seguir");

		opcao2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Foi ao trabalho sem intercorr�ncias.\n2 - No �nibus percebeu alguns olhares por conta de sua roupa e se sentiu desconfort�vel."));

		JOptionPane.showMessageDialog(null, nome + " chegou na empresa e foi ao banheiro se trocar, avisando a todos que por conta de seus compromissos tinha acordado atrasada");
		
		opcao2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Seus colegas de trabalho compreenderam o motivo, est�o todos sobrecarregados, ent�o imprevistos podem ocorrer.\n2 - Seus colegas de trabalho n�o acreditaram em suas palavras e acham que aquilo foi uma falta de comprometimento com as regras da empresa."));

		JOptionPane.showMessageDialog(null, "Na reuni�o " + nome + " traz uma proposta para o projeto.");

	}
}
