package appli_coloriage;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	logo titre = new logo();
	
	public Fenetre(){
		super();
		build();										//Initialisation de la fenêtre
	}
	
	private void build(){
		setTitle("Coloriage"); 							//On donne un titre à l'application
		setSize(1024,768); 								//On donne une taille à la fenêtre
		setLocationRelativeTo(null); 					//On centre la fenêtre sur l'écran
		setResizable(false); 							//On refuse le redimensionnement
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
		
		JPanel panel = new JPanel();					//création du panneau de la page d'accueil
		panel.setLayout(new GridLayout(2,1));			//définition de la grille
		
		panel.add(titre);								//ajout de l'image
		
		JPanel menu = new JPanel();						//création d'un panneau pour les liens
		menu.setBackground(new Color(229, 229, 229));
		menu.setLayout(new GridLayout(5,1,2,10));
		JButton bouton1 = new JButton(new Action_bouton_1("Niveau 1"));
		menu.add(bouton1);
		JButton bouton2 = new JButton(new Action_bouton_2("Niveau 2"));
		menu.add(bouton2);
		JButton bouton3 = new JButton(new Action_bouton_3("Niveau 3"));
		menu.add(bouton3);
		JButton bouton4 = new JButton(new Action_bouton_4("Niveau 4"));
		menu.add(bouton4);
		JButton bouton5 = new JButton(new Action_bouton_5("Niveau 5"));
		menu.add(bouton5);
		
		panel.add(menu);								//ajout du panneau des liens sur le panneau de l'accueil
		
		return panel;
	}

}
