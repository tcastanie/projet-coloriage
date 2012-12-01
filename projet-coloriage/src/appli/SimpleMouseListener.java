package appli;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.List;

public class SimpleMouseListener extends JCanvasMouseListener {

	public SimpleMouseListener(Jcanvas canvas) {
		super(canvas);

	}

	protected void rightClickAction(MouseEvent e) {
		System.out.println("click droit");
		
	}

	protected void leftClickAction(MouseEvent e) {
		System.out.println("click gauche");
		canvas.modifColor();
		
		
		}

	

	

}