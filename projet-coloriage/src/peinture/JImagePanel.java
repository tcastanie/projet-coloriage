package peinture;
	
	import java.awt.Graphics;
	import java.awt.Image;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

	/**
	 * Charger et afficher une image dans un panel
	 
	 */
	public class JImagePanel extends JPanel {
		
		private static final long serialVersionUID = 1L;
		
		private Image image = null;
	    private Boolean stretch = true;

	    /**
	     * Constructeur
	     * @param image image a afficher
	     */
	    public JImagePanel(Image image) {
	        this.image = image;
	    }

	    /**
	     * Constructeur
	     * @param file nom du fichier
	     */
	    public JImagePanel(String file) {
	        this.image = getToolkit().getImage(file);
	    }

	   /**
	    * Position de l'image sur le panel
	    * @param stretch true: etirer l'image / false: centrer l'image
	    */
	    public void setStretch(Boolean stretch) {
	        this.stretch = stretch;
	    }

	    /**
	     * Surcharger le dessin du composant
	     * @param g canvas
	     */
	    protected void paintComponent(Graphics g) {
	        int x = 4;
	        int y = 4;
	        int width = 0;
	        int height = 0;

	        if (this.stretch) {
	            width = this.getWidth();
	            height = this.getHeight();
	        } else {
	            width = this.image.getWidth(this);
	            height = this.image.getHeight(this);
	            x=((this.getWidth()-width)/2);
	            y=((this.getHeight()-height)/2);
	        }  
	        g.drawImage(this.image, x, y, width, height, this);
	    }
	    public Image getImage(){
	    	return this.image;
	    	
	    }

	    /**
	     * Exemple : jPanelImage dans un JFrame
	     * @param args
	     */
	    public static void main(String[] args) {
	    	
	    	
	        JImagePanel imagePanel = new JImagePanel("monimage.bitmap");
	    	
	        
	       
	        //Centrer l'image
	       imagePanel.setStretch(false);
	        //Etirer l'image
	       imagePanel.setStretch(true);

	     
	        
	       
	        
	        JFrame frame = new JFrame();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.add(imagePanel);
	        frame.setSize(600, 400);
	        frame.setLocation(200, 200);
	        frame.setVisible(true);
	       
	    }
	    
	    
	}

