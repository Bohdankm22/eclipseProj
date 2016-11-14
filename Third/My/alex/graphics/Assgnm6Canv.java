package alex.graphics;

import javax.swing.*;

import java.awt.*;

public class Assgnm6Canv extends JFrame {
	
	

	public Assgnm6Canv() {
		
		super("Canvas to draw");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(790, 810);
		Assignm6Waves f = new Assignm6Waves();
		getContentPane().add(f);
		
	}
}
