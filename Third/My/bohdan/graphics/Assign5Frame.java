package bohdan.graphics;

import javax.swing.JFrame;

public class Assign5Frame extends JFrame {
	
	public Assign5Frame() {
		super("Canvas to draw");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(840, 440);
		Assignment5CanadianFlag f = new Assignment5CanadianFlag();
		getContentPane().add(f);
	}
}
