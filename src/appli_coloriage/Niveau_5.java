package appli_coloriage;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Niveau_5 extends Fenetre{
	
	private static final long serialVersionUID = 1L;
	

	public Niveau_5(){
		super();
		build();
	}
	
	private void build(){
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
		
		JPanel panelniv5 = new JPanel();
		panelniv5.setLayout(new BorderLayout());
		panelniv5.setBackground(new Color(10, 212, 128));
		JButton retourmenu = new JButton(new ActionBoutonMenu5("Retour au menu"));
		panelniv5.add(retourmenu, BorderLayout.NORTH);
		
		return panelniv5;
	}
	
}
