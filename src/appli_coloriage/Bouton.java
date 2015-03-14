package appli_coloriage;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
  
public class Bouton extends JButton implements MouseListener{
	
	private static final long serialVersionUID = 1L;
	
	ClassLoader myClassLoader = Thread.currentThread().getContextClassLoader();
	Toolkit tk = Toolkit.getDefaultToolkit();
	
	String name;
	ZoneApercu za;	
	
	Image imgVert = tk.getImage(myClassLoader.getResource("fondVert.png"));
	Image imgRouge = tk.getImage(myClassLoader.getResource("fondRouge.png"));
	
	Image img = imgVert;
	

  public Bouton(AbstractAction e, String str, ZoneApercu za){
    super(e);
    this.name = str;
    this.za = za;    
    
    this.addMouseListener(this);
  }

  public void paintComponent(Graphics g){
	  Graphics2D g2d = (Graphics2D)g;
	  GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20, Color.cyan, true);
	  g2d.setPaint(gp);
	  g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), getParent());
	  g2d.setColor(Color.BLUE);
	  g2d.setFont(new Font("impact", Font.TRUETYPE_FONT, 30));
	  g2d.drawString(this.name,this.getWidth() / 2, (int) (this.getHeight() / 1.6 ));
	         
	  setFocusPainted(false);
	  setMargin(null);            
	  setBorder(BorderFactory.createLineBorder(new Color(229, 229, 229)));
	  setContentAreaFilled(false);
  }

  public void mouseClicked(MouseEvent event) {
  }

  public void mouseEntered(MouseEvent event) {
	  img = imgRouge;
	  if(this.name=="1"){
		  za.setValImg(1);
	  }
	  else if(this.name=="2"){
		  za.setValImg(2);
	  }
	  else if(this.name=="3"){
		  za.setValImg(3);
	  }
	  else if(this.name=="4"){
		  za.setValImg(4);
	  }
	  else if(this.name=="5"){
		  za.setValImg(5);
	  }
	  else{
		  za.setValImg(0);
	  }
	  
	  za.repaint();
  }

  public void mouseExited(MouseEvent event) {
	  img = imgVert;
	  za.setValImg(0);
	  za.repaint();
  }

  public void mousePressed(MouseEvent event) {
  }
 
  public void mouseReleased(MouseEvent event) {      
  }       
}
