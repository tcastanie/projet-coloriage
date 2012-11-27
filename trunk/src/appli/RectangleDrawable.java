package appli;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Point;
import java.util.ArrayList;

public class RectangleDrawable extends FormDrawable{

	public RectangleDrawable(Color color, Point pos, Dimension dim) {
		super(color, pos, dim);
		
	}

	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(color);
		//g.fillRect(rect.x,rect.y,rect.height,rect.width);
		g.drawRect(rect.x, rect.y, rect.width, rect.height);
		g.setColor(c);
	}

	
	
}