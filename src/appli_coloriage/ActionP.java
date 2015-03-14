package appli_coloriage;

import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import peinture.Peinture;

public class ActionP extends AbstractAction{

	private static final long serialVersionUID = 1L;

	Image dessin;
	VoletNiveau1 volet;
	
	public ActionP(String texte, Image dessin, VoletNiveau1 volet){
		super(texte);
		this.dessin=dessin;
		this.volet=volet;
	}
	
	public void actionPerformed(ActionEvent e) { 
		System.out.println("testage peinture");


		Peinture instanceP = new Peinture(dessin);
		instanceP.peinture();
		volet.repaint();
	}

}
