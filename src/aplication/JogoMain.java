package aplication;

import java.util.Scanner;
import entities.*;

public class JogoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String CAMINHO = "C:\\Users\\Sergio Carvalho\\Documents\\Java Projects\\Bnaval\\data\\";
		 
	  /* String CAMINHO =
		 "C:\\Users\\Sergio Carvalho\\Documents\\Java Projects\\Bnaval\\data\\";
		 
		  String CAMINHO = "C:\\Users\\Marcello Zambello\\Documents\\Project\\Bnaval\\data\\";*/

		Scanner sc = new Scanner(System.in);

		String[][] mJog1 = new String[15][15];
		String[][] mJog2 = new String[15][15];

		String arq1 = new String();
		String arq2 = new String();

		System.out.println("**** Batalha Naval ****");
		System.out.println("Digite, por favor, no formato \"C:\\\\nome\"");
		arq1 = CAMINHO + "Joga1" + ".csv";
		arq2 = CAMINHO + "Joga2" + ".csv";
		/*
		 * System.out.println("Arquivo do jogador 1 :"); arq1 = CAMINHO + sc.nextLine()
		 * + ".csv";
		 * 
		 * System.out.println("Arquivo do jogador 2 :"); arq2 = CAMINHO + sc.nextLine()
		 * + ".csv";
		 */

		System.out.println("Jogador 1 :" + arq1);
		System.out.println("Jogador 2 :" + arq2);

		sc.close();
		
		/* Trata Tab 1 */
		lerArquivoCsv lAC = new lerArquivoCsv(arq1);
		lAC.Carga();
		mJog1 = lAC.mat;
		exibeTabuleiro eT1 = new exibeTabuleiro(mJog1, 1);
		eT1.exibeTab();
		
		/* Trata Tab 2 */
		lerArquivoCsv AC2 = new lerArquivoCsv(arq2);
		AC2.Carga();
		mJog2 = AC2.mat;
		exibeTabuleiro eT2 = new exibeTabuleiro(mJog2, 2);
		eT2.exibeTab();

		/* erro aqui */
		validacaoInicio v1 = new validacaoInicio(mJog1);
		String retorno = v1.validar();
		System.out.println("retorno 1 = " + retorno);

		System.out.println("retorno teste");
		tabuleiro pr = new tabuleiro(1);
		pr.criaJanela(mJog1);

		validacaoInicio v2 = new validacaoInicio(mJog2);
		retorno = v2.validar();
		System.out.println("retorno 2 = " + retorno);
		tabuleiro sd = new tabuleiro(2);
		sd.criaJanela(mJog2);

		obterJogadas oJ = new obterJogadas(mJog1,mJog2)
		oJ.IniciaJogo();
		System.out.println("FIM DE JOGO");
	}
}
