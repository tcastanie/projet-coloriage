package accueil;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Niveau_1 extends Fenetre{
	
	private static final long serialVersionUID = 1L;
	

	public Niveau_1(){
		super();
		build();
	}
	
	private void build(){
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
		
		JPanel panelniv1 = new JPanel();
		panelniv1.setLayout(new BorderLayout());
		panelniv1.setBackground(new Color(10, 231, 89));
		JButton retourmenu = new JButton(new Action_bouton_menu("Retour au menu"));
		panelniv1.add(retourmenu, BorderLayout.NORTH);
		
		return panelniv1;
	}
	
}
