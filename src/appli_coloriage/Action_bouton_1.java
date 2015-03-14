package appli_coloriage;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class Action_bouton_1 extends AbstractAction{
	
	private static final long serialVersionUID = 1L;
	
	public static Niveau_1 niveau1;
	
	public Action_bouton_1(){
		super();
	}
		
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Clic niveau 1");
		
		niveau1 = new Niveau_1();
		niveau1.setVisible(true); // on affiche le niveau 1
		MainProjet.fenetreBasique.setVisible(false); //on cache l'accueil
	}
		
}
