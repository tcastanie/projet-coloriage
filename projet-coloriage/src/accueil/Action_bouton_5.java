package accueil;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

public class Action_bouton_5 extends AbstractAction {
	
	private static final long serialVersionUID = 1L;
	
		public Action_bouton_5(String texte){
			super(texte);
		}
		
		public void actionPerformed(ActionEvent e) { 
			System.out.println("Clic niveau 5");
		}

}
