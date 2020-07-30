package entities;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
/**
 * @author Rosicléia Frasson
 */
public class tabuleiro extends JFrame {

	private static final long serialVersionUID = 1L;
	JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem;
    JLabel label;
    JButton botao;
      
    String [] colunas = { "A", "B", "C", "D", "E","F","G","H","I","J","K","L","M","N","O"}; 
     
 
     public tabuleiro(Integer jog) {
        super ("Batalha Naval - Jogador : " + jog );
    }
     
    public void criaJanela(String[][] matriz){
        tabela = new JTable(matriz, colunas);
        barraRolagem = new JScrollPane(tabela);
        painelFundo.add(barraRolagem); 
        JLabel label2 = new JLabel("atirar");
        painelFundo.add(label2);  
    
        getContentPane().add(painelFundo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
 

}
    }