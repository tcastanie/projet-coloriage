package accueil;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class logo extends JPanel {
	
	public void paintComponent(Graphics g){
		try {
			g.setColor(new Color(229, 229, 229));
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			Image img;
			img = ImageIO.read(new File("logo_accueil.jpg"));
		    g.drawImage(img, 0, 0, this); 
		} catch (IOException e) {
			e.printStackTrace();
		}     
	}
}