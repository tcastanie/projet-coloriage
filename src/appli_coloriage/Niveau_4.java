package appli_coloriage;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Niveau_4 extends Fenetre{
	
	private static final long serialVersionUID = 1L;
	

	public Niveau_4(){
		super();
		build();
	}
	
	private void build(){
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
		
		JPanel panelniv4 = new JPanel();
		panelniv4.setLayout(new BorderLayout());
		panelniv4.setBackground(new Color(100, 12, 196));
		JButton retourmenu = new JButton(new ActionBoutonMenu4("Retour au menu"));
		panelniv4.add(retourmenu, BorderLayout.NORTH);
		
		return panelniv4;
	}
	
}
