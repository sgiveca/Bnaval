package aplication;
import java.util.Scanner;
import entities.*;

public class JogoMain {

   public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        String CAMINHO = "C:\\Users\\Sergio Carvalho\\Documents\\Java Projects\\Bnaval\\data\\";
		        Scanner sc = new Scanner(System.in);

		        String[][] mJog1 = new String[15][15];
		        String[][] mJog2 = new String[15][15];
		         
		        String arq1 = new String();
		        String arq2 = new String();
		        
		        System.out.println("**** Batalha Naval ****");
		        System.out.println("Digite, por favor, no formato \"C:\\\\nome\"");
		        arq1 = CAMINHO + "Joga1" + ".csv";
		        arq2 = CAMINHO + "Joga2" + ".csv";
		        /*System.out.println("Arquivo do jogador 1 :");
		        arq1 = CAMINHO + sc.nextLine() + ".csv";
		        
		        System.out.println("Arquivo do jogador 2 :"); 
		         arq2 = CAMINHO + sc.nextLine() + ".csv"; */
		        
		        System.out.println("Jogador 1 :" + arq1  );
		        System.out.println("Jogador 2 :" + arq2  );   
		        
		        sc.close();
		        
		        lerArquivoCsv lAC = new lerArquivoCsv(arq1); 
		        lAC.Carga();
		        mJog1 = lAC.mat;
		        if (mJog1[0][0].equals("E")) {
		            System.out.println("Erro na carga Arquivo1 :");
		        }
		        else
		        {
		            System.out.println(">>>> Arquivo 1 >>>>");
		            for(int i=0;i<15;i++) {
		              for(int n=0;n<15;n++ ) {
		                    if (mJog1[i][n] == null) {
		                        System.out.printf(" !");
		                    }
		                    else
		                    System.out.printf(" !" + mJog1[i][n]);
		                    }
		                System.out.println(" ");
		            }
		        }


		        lerArquivoCsv  AC2 = new lerArquivoCsv(arq2); 
		        AC2.Carga();
		        mJog2 = AC2.mat;


		        if (mJog1[0][0].equals("E")) {
		            System.out.println("Erro na carga Arquivo2 :");
		        }
		        else
		        {
		            System.out.println(">>>> Arquivo 2 >>>>");
		            for(int i=0;i<15;i++) {
		              for(int n=0;n<15;n++ ) {
		                    if (mJog2[i][n] == null) {
		                        System.out.printf(" !");
		                    }
		                    else
		                    System.out.printf(" !" + mJog2[i][n]);
		                    }
		                System.out.println(" ");
		            }
		        }
		        
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
		    

}
}
