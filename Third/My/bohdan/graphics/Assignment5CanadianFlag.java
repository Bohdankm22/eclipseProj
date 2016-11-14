package bohdan.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Assignment5CanadianFlag extends JPanel {
	
	public void paintComponent(Graphics g) {
		Graphics2D gr = (Graphics2D)g;
		gr.setColor (Color.red);
		
		gr.drawRect (0,0,840,440);
		gr.fillRect (0,0,210,440);
		gr.fillRect (630,0,210,440);

	    gr.setColor (Color.red);

		int[] XArray = {420, 385, 360, 375, 332, 320, 260, 280, 250, 340, 325, 410, 405, 435, 430, 515, 500, 590, 560, 580, 520, 508, 465, 480, 455};
	    int[] YArray = {30,100,78,188,128,148,138,198,215,295,320,310,410,410,310,320,295,215,198,138,148,128,188,78,100};
	   	gr.fillPolygon (XArray, YArray, 25);
	}
}
