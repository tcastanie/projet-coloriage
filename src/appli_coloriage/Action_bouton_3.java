package appli_coloriage;

import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

public class Action_bouton_3 extends AbstractAction {
	
	private static final long serialVersionUID = 1L;

	public static Niveau_3 niveau3;
	
	public Action_bouton_3(){
		super();
	}
	
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Clic niveau 3");

		niveau3 = new Niveau_3();
		niveau3.setVisible(true); // on affiche le niveau 3
		MainProjet.fenetreBasique.setVisible(false); //on cache l'accueil
	}

}
