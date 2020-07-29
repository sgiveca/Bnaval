package entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lerArquivoCsv {
    private String Name;
    public String[][] mat = new String[15][15];
    public String letra;
        
    public void Carga() {
    try {
        File arqCsv = new File(Name);
        String linhasDoArq = new String();
        Scanner leitor = new Scanner(arqCsv);
        linhasDoArq = leitor.nextLine(); /*despreza primeira linha */
        int i=0;
        while (leitor.hasNext()) {
            linhasDoArq = leitor.nextLine();
            String[] valoresEntre = linhasDoArq.split(";",16);
            for(int n=0;n<15;n++)
            {
            	letra = valoresEntre[n+1];
              if ( letra.charAt(0) == 'S' ||
                   letra.charAt(0) == 'H' ||
                   letra.charAt(0) == 'D' ||
                   letra.charAt(0) == 'Z' ||
                   letra.charAt(0) == 'C') {                        	  
                     mat[i][n] = valoresEntre[n+1];
                  }
              else
                 {
                  mat[i][n] = " ";
                 }
              }
            i++;    
        }
        leitor.close();        
    }
    catch(FileNotFoundException e)
        {
                mat[0][0] = "E";
        }
                
}

     public lerArquivoCsv(String name) {
            this.Name = name;
    }
}
