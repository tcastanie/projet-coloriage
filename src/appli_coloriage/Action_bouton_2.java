package appli_coloriage;

import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

public class Action_bouton_2 extends AbstractAction {
	
	private static final long serialVersionUID = 1L;

	public static Niveau_2 niveau2;
	
	public Action_bouton_2(){
		super();
	}
	
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Clic niveau 2");

		niveau2 = new Niveau_2();
		niveau2.setVisible(true); // on affiche le niveau 2
		MainProjet.fenetreBasique.setVisible(false); //on cache l'accueil
	}

}
