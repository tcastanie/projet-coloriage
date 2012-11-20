package coloriage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

public class Main {

	
	public static void main(String[] args) {
		Jcanvas jc = new Jcanvas();
		jc.setBackground(Color.WHITE);
		jc.setPreferredSize(new Dimension(400, 200));
		Dimension dim = new Dimension(40, 40);
		IDrawable rect = new RectangleDrawable(Color.RED, new Point(10, 10),dim);
	
		jc.addDrawable(rect);
		GUIHelper.showOnFrame(jc, "Fenetre");
		
	

	}

}
