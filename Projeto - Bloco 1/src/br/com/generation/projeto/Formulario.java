package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Formulario {
	
	public static void main(String[] args) {
		
		
		String opiniaoM, feedback;
		int check1, check2;
		boolean abuso,superior=false,salario=false;
		do {	
	check1 = Integer.parseInt(JOptionPane.showInputDialog("Segundo o levantamento das empresas de pesquisa Nielsen e Opinion Box, \n"
			+ "a maior parte das mulheres sabe o que � ass�dio (92%)\n e 46% delas j� sofreram ou presenciaram isso no trabalho, \nespecialmente na faixa et�ria entre 24 e 45 anos.\r\n"
			+ "\r\n"
			+ "	Voc� j� sofreu algum abuso no seu local de trabalho?\n\nDigite: \n\n(1) para sim \n\n(2) para n�o\n\n"));
		}
		while(check1 != 1 && check1 != 2);
					
	if(check1 == 1) {
		abuso = true;
		int sup =Integer.parseInt(JOptionPane.showInputDialog("Esse abuso veio de um superior?\n\nDigite: \n\n(1) para sim\n\n(2) para n�o\n\n"));
		if (sup==1) {
			superior=true;
		} else {
			superior=false;
		}
	} else {
		abuso = false;
	}
	
	do {
	check2 = Integer.parseInt(JOptionPane.showInputDialog("De acordo com um estudo do IBGE as mulheres ganharam em m�dia 20,50%"
			+ "\nmenos do que os homens no 4� trimestre de 2021.\r\n"
			+ "\r\n"
			+ "	Voc� recebe menos que um colega de trabalho homem na mesma fun��o?\n\nDigite: \n\n(1) para sim\n\n(2) para n�o\n\n"));
	if(check2==1) {
		salario=true;
	}else {
		salario=false;} 
	} 
	while(check2 != 1 && check2 != 2);
	
	opiniaoM = JOptionPane.showInputDialog("O que voc� acha que pode ser feito para minimizar o abuso contra a mulher no local de trabalho? ");
	
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
