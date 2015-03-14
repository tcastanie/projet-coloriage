package appli_coloriage;

import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

public class Action_bouton_4 extends AbstractAction {
	
	private static final long serialVersionUID = 1L;

	public static Niveau_4 niveau4;
	
	public Action_bouton_4(){
		super();
	}
	
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Clic niveau 4");

		niveau4 = new Niveau_4();
		niveau4.setVisible(true); // on affiche le niveau 4
		MainProjet.fenetreBasique.setVisible(false); //on cache l'accueil
	}

}
