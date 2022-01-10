package componentes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar.Separator;

public class Janela extends JFrame implements ActionListener{

	

	public Janela () {
		
		super("Análise de Algoritmos");
		criarJanelaPrincipal();
		inserirComponentes();

	}
	
	public void criarJanelaPrincipal() {
		
		
        setLayout(new GridLayout(0,2, 20, 20));
        setSize(900, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void inserirComponentes() {
		
		
		//FONTES
		Font fonte32 = new Font("Arial", Font.BOLD,32);
		Font fonte15 = new Font("Arial", Font.BOLD,15);
		//CAMPOS
	

		
		//PAINEIS
		JPanel painelSuperior = new JPanel();
		JPanel painelEsquerdo = new JPanel(new BorderLayout());
		painelEsquerdo.add(new JSeparator (Separator.VERTICAL));
		JPanel painelDireito = new JPanel(new BorderLayout());
		painelDireito.add(new JSeparator (Separator.VERTICAL));
		
		
		JPanel painelSubEsquerdo = new JPanel(new GridLayout(4,0));
		JPanel painelSubDireito = new JPanel(new GridLayout(4,0));
		

		
		//BOTOES
		JButton jb =  new JButton("Botao 1");
		JButton jb2 =  new JButton("Botao 2");
		
		
		//TEXTFIELDS
		
		JTextField campoTexto = new JTextField(15);
	
		
		//TEXT AREA
		JTextArea area1 = new JTextArea("AREA 1",5,20);
		area1.setLineWrap(true);
		JTextArea area2 = new JTextArea("AREA 2", 5,20);
		area2.setLineWrap(true);
		JTextArea area3 = new JTextArea("AREA 3", 5,20);
		area3.setLineWrap(true);
		JTextArea area4 = new JTextArea("AREA 4", 5,20);
		area4.setLineWrap(true);

		//SCROLLPANE
		JScrollPane sp1 = new JScrollPane(area1);
		JScrollPane sp2 = new JScrollPane(area2);
		JScrollPane sp3 = new JScrollPane(area3);
		JScrollPane sp4 = new JScrollPane(area4);
		
		
		//JLABEL
		
		JLabel lbGerarVetor = new JLabel("Gerar Vetor Aleatório");
		JLabel lbLerArquivo = new JLabel("Ler Arquivo CSV");
		


		//ADD COMPONENTES AOS SUBPAINES
		
		painelSubEsquerdo.add(new JLabel("Valores Desordenados: "));
		painelSubEsquerdo.add(sp1);
		painelSubEsquerdo.add(new JLabel("Valores Ordenados: "));
		painelSubEsquerdo.add(sp2);
		
		painelSubDireito.add(new JLabel("Valores Desordenados: "));
		painelSubDireito.add(sp3);
		painelSubDireito.add(new JLabel("Valores Ordenados: "));
		painelSubDireito.add(sp4);
		
		//ADD COMPONENTES AOS PAINEIS

		painelEsquerdo.add(lbGerarVetor, BorderLayout.PAGE_START);
		painelEsquerdo.add(painelSubEsquerdo, BorderLayout.PAGE_END);
		
		painelDireito.add(lbLerArquivo, BorderLayout.PAGE_START);
		painelDireito.add(painelSubDireito, BorderLayout.PAGE_END);
		
		
		//ADD COMPONENTES AO JFFRAME
		
		
		add(painelEsquerdo);
		add(painelDireito);


		setVisible(true);
	}
	
    

	public static void main(String[] args) {
		 new Janela();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
