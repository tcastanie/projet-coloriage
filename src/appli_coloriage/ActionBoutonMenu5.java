package appli_coloriage;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ActionBoutonMenu5  extends AbstractAction{
	private static final long serialVersionUID = 1L;

	public ActionBoutonMenu5(String texte){
		super(texte);
	}
	
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Retour au menu");

		MainProjet.fenetreBasique.setVisible(true); //la page d'accueil est affichée
		Action_bouton_5.niveau5.dispose(); //le niveau 5 est supprimé de la mémoire
	}
}
