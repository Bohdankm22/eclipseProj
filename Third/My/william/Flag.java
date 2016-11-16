package william;

import java.awt.*;

import javax.swing.*;

public class Flag extends JPanel{
		public void paintComponent(Graphics comp){
			Graphics2D comp2D = (Graphics2D)comp;
			comp2D.setColor(Color.red);
			comp2D.fillRect(30,40,240,120);
			comp2D.setColor(Color.white);
			comp2D.fillRect (90,40,120,120);
			int [] x = {152,151,175,173,196,191,194,181,177,164,169,160,150,141,132,135,123,118,106,109,104,127,124,149,148};
			int [] y = {150,126,129,121,101,98,82,85,78,90,62,67,50,67,62,90,78,85,82,98,101,121,129,126,150};
			int pts = x.length;
			comp.setColor(Color.red);
			Polygon poly = new Polygon(x,y,pts);
			comp2D.fillPolygon(poly);
		}

}