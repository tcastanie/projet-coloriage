package appli_coloriage;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Niveau_2 extends Fenetre{
	
	private static final long serialVersionUID = 1L;
	

	public Niveau_2(){
		super();
		build();
	}
	
	private void build(){
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
		
		JPanel panelniv2 = new JPanel();
		panelniv2.setLayout(new BorderLayout());
		panelniv2.setBackground(new Color(156, 201, 189));
		JButton retourmenu = new JButton(new ActionBoutonMenu2("Retour au menu"));
		panelniv2.add(retourmenu, BorderLayout.NORTH);
		
		return panelniv2;
	}
	
}
