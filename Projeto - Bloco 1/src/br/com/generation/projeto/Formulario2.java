package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Formulario2 {
	
	public static void main(String[] args) {
		
		
		String opiniaoM, feedback;
		int check1, check2, check3, check4;
		boolean abuso,superior=false,maisHomens=false;
		do {	
	check1 = Integer.parseInt(JOptionPane.showInputDialog("Voc� acredita que pode causar uma mudan�a no seu local de trabalho?\n\nDigite: \n\n(1) para sim \n\n(2) para n�o\n\n"));
		}
		while(check1 != 1 && check1 != 2);
					
	if(check1 == 1) {
		abuso = true;
		
		} else {
			abuso=false;
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
	
	opiniaoM = JOptionPane.showInputDialog("O que voc� acha que pode ser feito para minimizar o abuso contra a mulher no local de trabalho? ");
	
	do {
		check3 = Integer.parseInt(JOptionPane.showInputDialog("Voc� j� presenciou algum abuso no seu local de trabalho?\n\nDigite: \n\n(1) para sim\n\n(2) para n�o\n\n"));
		if(check3==1) {
			maisHomens=true;
		}else {
			maisHomens=false;} 
		
		JOptionPane.showMessageDialog(null, "Quase metade das mulheres j� sofreu algum ass�dio sexual no trabalho, segundo pesquisa do LinkedIn e da consultoria de inova��o social Think Eva [...] Entre elas, 15% pediram demiss�o do trabalho ap�s o ass�dio. E apenas 5% delas recorrem ao RH das empresas para reportar o caso. [...] a maioria das entrevistadas que j� sofreram alguma forma de ass�dio sexual no ambiente de trabalho s�o mulheres negras (52%) e que recebem entre dois e seis sal�rios m�nimos (49%). Al�m disso, o Norte (63%) e Centro-Oeste (55%) t�m uma concentra��o de relatos superior �s demais regi�es.\r\n"
				+ "Mais de 95% das entrevistadas afirmam saber o que � ass�dio sexual no trabalho, mas pouco mais de 51% falam com frequ�ncia sobre o tema.\r\n");
		
		} 
		while(check2 != 1 && check2 != 2);
	
	if (abuso == true) {
		feedback = JOptionPane.showInputDialog(null, "Algumas atitudes s�o importantes para fazer cessar o ass�dio e evitar que ele se propague e se agrave no ambiente de trabalho:\r\n"
				+ " Dizer, claramente, n�o ao assediador; \r\n"
				+ "Evitar permanecer sozinha (o) no mesmo local que o (a) assediador (a); \r\n"
				+ "Anotar, com detalhes, todas as abordagens de car�ter sexual sofridas: dia, m�s, ano, hora, local ou setor, nome do (a) agressor (a), colegas que testemunharam os fatos, conte�do das conversas e o que mais achar necess�rio; \r\n"
				+ "Dar visibilidade, procurando a ajuda dos colegas, principalmente daqueles que testemunharam o fato, que s�o ou foram v�timas; \r\n"
				+ "Reunir provas, como bilhetes, e-mails, mensagens em redes sociais, presentes.; \r\n"
				+ "Livrar-se do sentimento de culpa, uma vez que a irregularidade da conduta n�o depende do comportamento da v�tima, mas sim do agressor; \r\n"
				+ "Denunciar aos �rg�os de prote��o e defesa dos direitos das mulheres ou dos trabalhadores, inclusive o sindicato profissional; \r\n"
				+ "Comunicar aos superiores hier�rquicos, bem como informar por meio dos canais internos da empresa, tais como ouvidoria, comit�s de �ticas ou outros meios id�neos dispon�veis; \r\n"
				+ "Buscar apoio junto a familiares, amigos e colegas; \r\n"
				+ "Relatar o fato perante a Cipa (Comiss�o Interna de Preven��o de Acidentes) e ao SESMT (Servi�o Especializado em Engenharia de Seguran�a e em Medicina do Trabalho)\n\nObrigado por jogar!\n\nSe tiver algum coment�rio para a equipe de desenvolvimento, "
				+ "sobre algo que faltou no jogo, por favor comente abaixo e d� ok. Caso contr�rio � s� cancelar.");
	} else { 
		
	}
	
	}

}