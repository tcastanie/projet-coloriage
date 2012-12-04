package appli_coloriage;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ActionBoutonMenu3  extends AbstractAction{
	private static final long serialVersionUID = 1L;

	public ActionBoutonMenu3(String texte){
		super(texte);
	}
	
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Retour au menu");

		MainProjet.fenetreBasique.setVisible(true); //la page d'accueil est affichée
		Action_bouton_3.niveau3.dispose(); //le niveau 3 est supprimé de la mémoire
	}
}
