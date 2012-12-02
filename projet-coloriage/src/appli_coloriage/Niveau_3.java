package appli_coloriage;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Niveau_3 extends Fenetre{
	
	private static final long serialVersionUID = 1L;
	

	public Niveau_3(){
		super();
		build();
	}
	
	private void build(){
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
		
		JPanel panelniv3 = new JPanel();
		panelniv3.setLayout(new BorderLayout());
		panelniv3.setBackground(new Color(0, 132, 206));
		JButton retourmenu = new JButton(new ActionBoutonMenu3("Retour au menu"));
		panelniv3.add(retourmenu, BorderLayout.NORTH);
		
		return panelniv3;
	}
	
}
