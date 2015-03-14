package peinture;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;


public class Peinture {
	
	BufferedImage image;
	
	public Peinture(Image img){
		image=this.toBufferedImage(img);
	}
	
	BufferedImage toBufferedImage(Image image) {   // Conversion d'une image en BufferedImage
        // On teste si l'image n'est pas déja une instance de BufferedImage
        if(image instanceof BufferedImage) {
                // On ne fait rien !
                return((BufferedImage)image);
        } else {
                // On s'assure que l'image est complètement chargée
                image = new ImageIcon(image).getImage();
                // On crée la nouvelle image
                BufferedImage bufferedImage = new BufferedImage(image.getWidth(null),image.getHeight(null),BufferedImage.TYPE_INT_RGB );
                Graphics g = bufferedImage.createGraphics();
                g.drawImage(image,0,0,null);
                g.dispose();
                return(bufferedImage);
        }
 }
	
	public Image peinture() {
		
		
		
		try {
			System.out.println("image chargee");
			
			EnsemblePix ep = new EnsemblePix(image.getWidth(),image.getHeight());
			// parcourir les pixels de l'image
			System.out.println("debut boucle");
		for (int i = 0; i < image.getWidth(); i++) {
			for (int j = 0; j < image.getHeight(); j++) {
			
			// recuperer couleur de chaque pixel
			Color pixelcolor= new Color( image.getRGB(i, j));
			
			// recuperer les valeur rgb (rouge ,vert ,bleu) de cette couleur
			int r=pixelcolor.getRed();
			int g=pixelcolor.getGreen();
			int b=pixelcolor.getBlue();
			System.out.println("debut addPixel");
			ep.addPixel(r,g,b);
			}//End of for j
			}//end of for i
			
			//ep.AfficheTab();
			System.out.println("debut remplissage");
			
			ep.remplissage(30, 20, 200, 0, 00);
				
			for (int i = 0; i < image.getWidth(); i++) {
				for (int j = 0; j < image.getHeight(); j++) {
					
				// recuperer couleur de chaque pixel
				
				
				
				int r=ep.getTab()[i][j].getR();
				int g=ep.getTab()[i][j].getG();
				int b=ep.getTab()[i][j].getB();
			
				int rgb=new Color(r,g,b).getRGB(); //cree une couleur a partir de rgb
				image.setRGB(i, j, rgb); // Modifie la couleur du pixel
			// enregistrement d'image
			//ImageIO.write(image, "png", System.out);
		} 
	}
		}
		catch (Exception e) {
			System.err.println("erreur -> "+e.getMessage());
		}
		return image;
	}
}
