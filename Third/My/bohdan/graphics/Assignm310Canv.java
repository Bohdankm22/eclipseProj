package bohdan.graphics;

import javax.swing.JFrame;

import alex.graphics.Assignm6Waves;

public class Assignm310Canv extends JFrame {
	
	public Assignm310Canv() {
		super("Canvas to draw");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(660, 680);
		Assignm310Squires f = new Assignm310Squires();
		getContentPane().add(f);
		
	}
}
