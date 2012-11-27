package appli;

import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.*;

public class Jcanvas extends JPanel {
	
private List drawables = new LinkedList();
	
	public void paint(Graphics g) {
		for (Iterator iter = drawables.iterator(); iter.hasNext();) {
			IDrawable d = (IDrawable) iter.next();
			d.draw(g);	
		}
	}

	public void addDrawable(IDrawable d) {
		drawables.add(d);
		repaint();
	}

	public void removeDrawable(IDrawable d) {
		drawables.remove(d);
		repaint();
	}

	public void clear() {
		drawables.clear();
		repaint();
		
	}
	public void modifColor()
	{
		drawables.clear();
		Dimension dim = new Dimension(40, 40);
		IDrawable rect = new RectangleDrawable(Color.BLACK, new Point(10, 10),dim);
		drawables.add(rect);
	}
}