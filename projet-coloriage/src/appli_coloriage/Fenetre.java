package appli_coloriage;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame{
	
	private static final long serialVersionUID = 1L;
	logo titre = new logo();
	int valeurImage = 0;
	ZoneApercu za = new ZoneApercu();
	
	ClassLoader myClassLoader = Thread.currentThread().getContextClassLoader();
	Toolkit tk = Toolkit.getDefaultToolkit();
	
	public Fenetre(){
		super();
		build();										//Initialisation de la fen�tre
	}
	
	private void build(){
		setTitle("Coloriage"); 							//On donne un titre � l'application
		setSize(1024,768); 								//On donne une taille � la fen�tre
		//setSize(800,600);
		setLocationRelativeTo(null); 					//On centre la fen�tre sur l'�cran
		setResizable(false); 							//On refuse le redimensionnement
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit � l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
		
		JPanel panel = new JPanel();					//cr�ation du panneau de la page d'accueil
		panel.setLayout(new GridLayout(2,1));			//d�finition de la grille
		
		JPanel menu = new JPanel();						//cr�ation du volet contenant les liens
		JPanel bas = new JPanel();						//volet du bas
		bas.setBackground(new Color(229, 229, 229));
		bas.setLayout(new GridLayout(1,2,20,1));
		menu.setBackground(new Color(229, 229, 229));
		menu.setLayout(new GridLayout(5,1,0,0));
		
		Bouton bouton1 = new Bouton(new Action_bouton_1(), "1", za);
		//bouton1.setIcon(new ImageIcon(tk.getImage(myClassLoader.getResource("smiley-maison.gif"))));
		menu.add(bouton1);
		Bouton bouton2 = new Bouton(new Action_bouton_2(), "2", za);
		menu.add(bouton2);
		Bouton bouton3 = new Bouton(new Action_bouton_3(), "3", za);
		menu.add(bouton3);
		Bouton bouton4 = new Bouton(new Action_bouton_4(), "4", za);
		menu.add(bouton4);
		Bouton bouton5 = new Bouton(new Action_bouton_5(), "5", za);
		menu.add(bouton5);
		
		bas.add(menu);								//ajout des liens
		bas.add(za);
		
		panel.add(titre);							//ajout de l'image "coloriage"
		panel.add(bas);								//ajout du panneau des liens sur le panneau de l'accueil
		
		return panel;
	}

}
