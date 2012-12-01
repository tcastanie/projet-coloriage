package appli_coloriage;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class Action_bouton_menu  extends AbstractAction{
	private static final long serialVersionUID = 1L;

	public Action_bouton_menu(String texte){
		super(texte);
	}
	
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Retour au menu");

		InterfaceAccueil.fenetreBasique.setVisible(true); //la page d'accueil est affichée
		Action_bouton_1.niveau1.dispose(); //le niveau 1 est supprimé de la mémoire
	}
}
