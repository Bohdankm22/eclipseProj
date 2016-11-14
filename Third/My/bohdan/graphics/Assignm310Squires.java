package bohdan.graphics;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JPanel;

public class Assignm310Squires extends JPanel {
	
	public void paintComponent(Graphics comp) {
		Graphics2D comp2D = (Graphics2D)comp;
		Random rand = new Random();
		for (int i = 0; i <= 25; i++) {
			for (int j = 0; j <= 25; j++) {
				comp2D.setPaint(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
				comp.fillRect(i * 25, j * 25, 20, 20);
				
			}
		}
		
	}

}
