package accueil;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame {
	
	logo titre = new logo();
	
	public Fenetre(){
		super();
		
		build();//On initialise notre fen�tre
	}
	
	private void build(){
		setTitle("Coloriage"); //On donne un titre � l'application
		setSize(1024,768); //On donne une taille � notre fen�tre
		setLocationRelativeTo(null); //On centre la fen�tre sur l'�cran
		setResizable(true); //On permet le redimensionnement
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit � l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		
		panel.add(titre);
		
		JPanel menu = new JPanel();
		menu.setBackground(new Color(229, 229, 229));
		menu.setLayout(new GridLayout(5,1,2,10));
		JButton bouton1 = new JButton("Niveau 1");
		menu.add(bouton1);
		JButton bouton2 = new JButton("Niveau 2");
		menu.add(bouton2);
		JButton bouton3 = new JButton("Niveau 3");
		menu.add(bouton3);
		JButton bouton4 = new JButton("Niveau 4");
		menu.add(bouton4);
		JButton bouton5 = new JButton("Niveau 5");
		menu.add(bouton5);
		
		panel.add(menu);
		
		return panel;
	}

}
