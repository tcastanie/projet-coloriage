package appli_coloriage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class ZoneApercu extends JPanel{
	
	public int valeurImage;
	
	private static final long serialVersionUID = 1L;
	
	ClassLoader myClassLoaderZA = Thread.currentThread().getContextClassLoader();
	Toolkit tkZA = Toolkit.getDefaultToolkit();
	
	public ZoneApercu (){
		this.valeurImage = 0;
	}
	public void setValImg(int val)
	{
		this.valeurImage=val;
	}
	public void paintComponent(Graphics g){
		
		Image miniatureApercu0 = tkZA.getImage(myClassLoaderZA.getResource("miniature0.png"));
		Image miniatureApercu1 = tkZA.getImage(myClassLoaderZA.getResource("miniature1.png"));
		Image miniatureApercu2 = tkZA.getImage(myClassLoaderZA.getResource("miniature2.png"));
		Image miniatureApercu3 = tkZA.getImage(myClassLoaderZA.getResource("miniature3.png"));
		Image miniatureApercu4 = tkZA.getImage(myClassLoaderZA.getResource("miniature4.png"));
		Image miniatureApercu5 = tkZA.getImage(myClassLoaderZA.getResource("miniature5.png"));
		
		if(valeurImage == 0){
			g.drawImage(miniatureApercu0, 1, 1, new Color(229, 229, 229), this);
		}
		else if(valeurImage == 1){
			g.drawImage(miniatureApercu1, 1, 1, new Color(229, 229, 229), this);
		}
		else if(valeurImage == 2){
			g.drawImage(miniatureApercu2, 1, 1, new Color(229, 229, 229), this);
		}
		else if(valeurImage == 3){
			g.drawImage(miniatureApercu3, 1, 1, new Color(229, 229, 229), this);
		}
		else if(valeurImage == 4){
			g.drawImage(miniatureApercu4, 1, 1, new Color(229, 229, 229), this);
		}
		else if(valeurImage == 5){
			g.drawImage(miniatureApercu5, 1, 1, new Color(229, 229, 229), this);
		}
	
	}
	
	
	
}
