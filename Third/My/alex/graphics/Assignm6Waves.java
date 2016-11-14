package alex.graphics;

import java.awt.*;
import javax.swing.*;

public class Assignm6Waves extends JPanel {
	
	public void paintComponent(Graphics comp) {
		Graphics2D comp2D = (Graphics2D)comp;
		
		GradientPaint pl = new GradientPaint(2F,2F, Color.red, 800,800, Color.blue);
		comp2D.setPaint(pl);
		
		for (int i = 0; i <= 25; i++) {
			for (int j = 0; j <= 25; j++) {
				comp.drawArc(30 * i, 30 * j, 30, 30, 0, -180);
			}
		}
		
	}
}
