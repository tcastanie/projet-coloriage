package appli_coloriage;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

public class Action_bouton_5 extends AbstractAction {
	
	private static final long serialVersionUID = 1L;

	public static Niveau_5 niveau5;
	
	public Action_bouton_5(String texte){
		super(texte);
	}
	
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Clic niveau 5");

		niveau5 = new Niveau_5();
		niveau5.setVisible(true); // on affiche le niveau 5
		Main.fenetreBasique.setVisible(false); //on cache l'accueil
	}

}
