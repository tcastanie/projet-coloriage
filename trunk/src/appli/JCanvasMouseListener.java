package appli;

import java.awt.event.*;
import javax.swing.SwingUtilities;

public abstract class JCanvasMouseListener extends MouseAdapter {

	protected Jcanvas canvas;

	public JCanvasMouseListener(Jcanvas canvas) {
		super();
		this.canvas = canvas;
		canvas.addMouseListener(this);
	}
		
	public Jcanvas getCanvas() {
		return canvas;
	}

	public void mouseClicked(MouseEvent e) {
		if (SwingUtilities.isLeftMouseButton(e)) {
			leftClickAction(e);
		} else {
			rightClickAction(e);
		}
	}

	
	protected void rightClickAction(MouseEvent e) {
			System.out.println("click gauche");
	}

	protected void leftClickAction(MouseEvent e) {
		
	}
	
}