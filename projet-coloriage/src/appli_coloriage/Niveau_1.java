package appli_coloriage;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Niveau_1 extends Fenetre{
	
	private static final long serialVersionUID = 1L;
	
	VoletNiveau1 volet = new VoletNiveau1();
	Image dessin1 = tk.getImage(myClassLoader.getResource("poisson.png"));
	
	public Niveau_1(){
		build();
	}
	
	private void build(){
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
		
		JPanel panelniv1 = new JPanel();
		panelniv1.setLayout(new BorderLayout());
		JButton retourmenu = new JButton(new ActionBoutonMenu1("Retour au menu"));
		panelniv1.add(retourmenu, BorderLayout.NORTH);
		panelniv1.add(volet, BorderLayout.CENTER);
		JButton actionP = new JButton(new ActionP("Test Action", dessin1, volet));
		panelniv1.add(actionP, BorderLayout.SOUTH);
		
		return panelniv1;
	}
	
}
