package componentes;

import java.awt.BorderLayout;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Janela extends JFrame implements ActionListener{

	

	public Janela () {
		
		super("Análise de Algoritmos");
		criarJanelaPrincipal();
		inserirComponentes();

	}
	
	public void criarJanelaPrincipal() {
		
		
        setLayout(new BorderLayout());
        setSize(900, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void inserirComponentes() {
		
		
		//FONTES
		Font fonte25 = new Font("Arial", Font.BOLD,32);
		//CAMPOS
		JLabel campo = new JLabel("teste");
		
		//PAINEIS
		JPanel painelSuperior = new JPanel();
		JPanel painelTitulo = new JPanel();
		JPanel painelTituloCentral = new JPanel();
		
		//BOTOES
		JButton jb =  new JButton("Botao 1");
		JButton jb2 =  new JButton("Botao 2");
		
		
		//TEXTFIELDS
		
		JTextField campoTexto = new JTextField();
		campoTexto.setSize(30 , 30);
		
		//ADD COMPONENTES AOS PAINES
		painelSuperior.add(jb);
		painelSuperior.add(jb2);
		
		//ADD COMPONENTES AO JFFRAME
		
		add(painelSuperior, BorderLayout.NORTH);
		
		add(campoTexto, BorderLayout.CENTER);
		
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
