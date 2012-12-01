package accueil;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

public class Action_bouton_1 extends AbstractAction{
	
	private static final long serialVersionUID = 1L;
	
	public static Niveau_1 niveau1;
	
		public Action_bouton_1(String texte){
			super(texte);
		}
		
		public void actionPerformed(ActionEvent e) { 
			System.out.println("Clic niveau 1");

			niveau1 = new Niveau_1();
			niveau1.setVisible(true);
			InterfaceAccueil.fenetreBasique.setVisible(false);
		}

}
