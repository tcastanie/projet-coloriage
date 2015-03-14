package appli_coloriage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import peinture.*;

public class VoletNiveau1 extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	ClassLoader myClassLoader = Thread.currentThread().getContextClassLoader();
	Toolkit tk = Toolkit.getDefaultToolkit();
	
	Image dessin1 = tk.getImage(myClassLoader.getResource("poisson.png"));
	
	public Image getDessin1() {
		return dessin1;
	}

	public void setDessin1(Image dessin1) {
		this.dessin1 = dessin1;
	}

	public void paintComponent(Graphics g){
		g.drawRect(80, 600, 200, 60);
		g.drawRect(300, 600, 200, 60);
		g.drawRect(520, 600, 200, 60);
		g.drawRect(740, 600, 200, 60);
		g.setColor(Color.RED);
		g.fillRect(81, 601, 199, 59);
		g.setColor(Color.YELLOW);
		g.fillRect(301, 601, 199, 59);
		g.setColor(Color.BLUE);
		g.fillRect(521, 601, 199, 59);
		g.setColor(Color.GREEN);
		g.fillRect(741, 601, 199, 59);

		g.drawImage(getDessin1(), 200, 60, this);
	}
	
}
