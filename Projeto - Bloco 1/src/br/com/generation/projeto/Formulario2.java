package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Formulario2 {
	
	public static void main(String[] args) {
		
		
		String opiniaoH, feedback, feedback1;
		int check1, check2, check3, check4;
		boolean mudanca,superior=false,maisHomens=false;
		do {	
	check1 = Integer.parseInt(JOptionPane.showInputDialog("Voc� acredita que pode causar uma mudan�a no seu local de trabalho?\n\nDigite: \n\n(1) para sim \n\n(2) para n�o\n\n"));
		}
		while(check1 != 1 && check1 != 2);
					
	if(check1 == 1) {
		mudanca = true;
		
		} else {
			mudanca=false;
		}
	
	do {
	check2 = Integer.parseInt(JOptionPane.showInputDialog("A quantidade de homens que trabalham com voc�, � maior do que a quantidade de mulheres?\n\nDigite: \n\n(1) para sim\n\n(2) para n�o\n\n"));
	if(check2==1) {
		maisHomens=true;
	}else {
		maisHomens=false;} 
	
	JOptionPane.showMessageDialog(null, "Em 2019, a taxa de participa��o das mulheres com 15 anos ou maior de\r\n"
			+ "idade foi de 54,5%, enquanto entre os homens esta media chegou a 73,7%, uma diferen�a de 19,2 pontos percentuais. - IBGE 2019\r\n");
	
	} 
	while(check2 != 1 && check2 != 2);
	
	
	
	do {
		check3 = Integer.parseInt(JOptionPane.showInputDialog("Voc� j� presenciou algum abuso no seu local de trabalho?\n\nDigite: \n\n(1) para sim\n\n(2) para n�o\n\n"));
		if(check3==1) {
			maisHomens=true;
		}else {
			maisHomens=false;} 
		
		JOptionPane.showMessageDialog(null, "Quase metade das mulheres j� sofreu algum ass�dio sexual no trabalho, segundo pesquisa do LinkedIn e da consultoria de inova��o social Think Eva [...] \n"
				+ "Entre elas, 15% pediram demiss�o do trabalho ap�s o ass�dio. E apenas 5% delas recorrem ao RH das empresas para reportar o caso. [...] \n a "
				+ "maioria das entrevistadas que j� sofreram alguma forma de ass�dio sexual no ambiente de trabalho s�o mulheres negras (52%) e que recebem entre dois e seis sal�rios m�nimos (49%).\n "
				+ "Al�m disso, o Norte (63%) e Centro-Oeste (55%) t�m uma concentra��o de relatos superior �s demais regi�es.\r\n"
				+ "Mais de 95% das entrevistadas afirmam saber o que � ass�dio sexual no trabalho, mas pouco mais de 51% falam com frequ�ncia sobre o tema.\r\n");
		
		} 
		while(check3 != 1 && check3 != 2);
	
	do {
		check4 = Integer.parseInt(JOptionPane.showInputDialog("O seu salario � maior do que  de uma mulher na mesma fun��o?\n\nDigite: \n\n(1) para sim\n\n(2) para n�o\n\n"));
		if(check4==1) {
			maisHomens=true;
		}else {
			maisHomens=false;} 
		
		JOptionPane.showMessageDialog(null, "As mulheres ganham cerca de 20% menos do que os homens no Brasil e a diferen�a salarial entre os g�neros segue neste patamar elevado,\n"
				+ " mesmo quando se compara trabalhadores do mesmo perfil de escolaridade e idade e na mesma categoria de ocupa��o. \n"
				+ "� o que mostra levantamento da consultoria IDados, com base na Pesquisa Nacional por Amostra de Domic�lio do IBGE.");
				
		
		} 
		while(check4 != 1 && check4 != 2);
	
	JOptionPane.showMessageDialog(null, "Uma pesquisa do site Vagas.com mostrou que,[...] enquanto o ass�dio moral � equilibrado entre homens e mulheres, no sexual, elas formam 80% das v�timas.\r\n"
			+ "O ass�dio moral acontece quando, de forma repetitiva e prolongada, o agressor exp�e o colaborador a situa��es humilhantes, com ofensas ou amea�as.\r\n"
			+ "J� o ass�dio sexual se caracteriza por contatos f�sicos for�ados, palavras, convites, humilha��es e intimida��o com fundo sexual.");
	
	opiniaoH = JOptionPane.showInputDialog(null, "O que voc� pode fazer para diminuir a discrimina��o contra a mulher no seu local de trabalho?");
		
	
	if (mudanca == true) {
		JOptionPane.showMessageDialog(null, "Isso mesmo, suas atitudes  contribuem com um ambiente de trabalho melhor para a mulher: Seja sempre gentil com uma, ela poderia ser da sua fam�lia.\r\n"
				+ "Evite piadas constrangedoras de sexismo, assedio e etc.\r\n"
				+ "N�o participe de brincadeiras que n�o cabem ao ambiente de trabalho, comunique aos superiores hier�rquicos, bem como informar por meio dos canais internos da empresa,\n "
				+ "tais como ouvidoria, comit�s de �ticas ou outros meios id�neos dispon�veis\r\n"
				+ "Se tiver algum coment�rio para a equipe de desenvolvimento, sobre algo que faltou no jogo, por favor comente abaixo e d� ok. Caso contr�rio � s� cancelar.");
	} else  { 
		JOptionPane.showMessageDialog(null, "Voc� pode sim contribuir com um ambiente de trabalho melhor para a mulher: Seja sempre gentil com uma mulher, ela poderia ser da sua fam�lia.\r\n"
				+ "Evite piadas constrangedoras de sexismo, assedio e etc.\r\n"
				+ "N�o participe de brincadeiras que n�o cabem ao ambiente de trabalho, comunique aos superiores hier�rquicos, bem como informar por meio dos canais internos da empresa, tais como ouvidoria,\n "
				+ "comit�s de �ticas ou outros meios id�neos dispon�veis\r\n"
				+ "Se tiver algum coment�rio para a equipe de desenvolvimento, sobre algo que faltou no jogo, por favor comente abaixo e d� ok. Caso contr�rio � s� cancelar.");
	}
	
	}

}