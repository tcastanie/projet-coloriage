package appli_coloriage;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ActionBoutonMenu4  extends AbstractAction{
	private static final long serialVersionUID = 1L;

	public ActionBoutonMenu4(String texte){
		super(texte);
	}
	
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Retour au menu");

		MainProjet.fenetreBasique.setVisible(true); //la page d'accueil est affichée
		Action_bouton_4.niveau4.dispose(); //le niveau 4 est supprimé de la mémoire
	}
}
